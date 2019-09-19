package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Customer;
import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.entity.ShoppingCart;
import gq.cader.realfakestoreserver.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class ShoppingCartService {

    private ShoppingCartRepository shoppingCartRepository;
    private ShoppingCart shoppingCart;
    private Map<Product, Integer> shoppingCartProductQuantityMap;
    private ProductService productService;
    @Autowired
    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository, ProductService productService) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.shoppingCart = new ShoppingCart();
        this.productService = productService;
    }

    protected void setShoppingCartByCustomerReference(Customer customer) {
        this.shoppingCart = Optional.of(customer.getShoppingCart())
                .orElseGet(ShoppingCart::new);

        this.shoppingCartProductQuantityMap = shoppingCart.getProductQuantityMap();
    }

    protected void setShoppingCartByShoppingCartId(Integer shoppingCartId) {
        this.shoppingCart = shoppingCartRepository.findById(shoppingCartId)
                .orElseGet(ShoppingCart::new);

        this.shoppingCartProductQuantityMap = shoppingCart.getProductQuantityMap();
    }

    protected Map<Product, Integer> previewProductQuantityMapForCheckout(ShoppingCart shoppingCart) {
        return shoppingCart.getProductQuantityMap().entrySet().stream()
                .filter(x -> productService.verifyProductInventoryForPreCheckout(x.getKey(), x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void updateShoppingCartProductQuantity(Product product, Integer quantity) {
        shoppingCartProductQuantityMap.put(product, quantity);
        removeProductsWithZeroQuantity();
    }

    public void updateShoppingCartProductQuantityByDelta(Product product, Integer delta) {

        shoppingCartProductQuantityMap.put(product,
                (shoppingCartProductQuantityMap.containsKey(product)) ?               //Does key exist?
                        ((shoppingCartProductQuantityMap.get(product) + delta))  //If true apply delta
                        :
                        delta);                                  //If new key, put delta as quantity
        removeProductsWithZeroQuantity();

    }

    public Integer getProductQuantity(Product product) {
        return Optional.of(shoppingCartProductQuantityMap.get(product))
                .orElse(0);
    }

    public Double getTotalPrice() {
        return shoppingCartProductQuantityMap.entrySet()
                .stream()
                .flatMapToDouble(
                        x -> DoubleStream.of(
                                x.getKey().getPrice() * x.getValue()))
                .sum();
    }

    public void assignShoppingCartToCustomer(Customer customer) {
        customer.setShoppingCart(Optional.of(this.shoppingCart)
                .orElseGet(ShoppingCart::new));
    }

    private void removeProductsWithZeroQuantity() {
        this.shoppingCartProductQuantityMap =
                this.shoppingCartProductQuantityMap.entrySet()
                        .stream()
                        .filter(x -> x.getValue() > 0)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}

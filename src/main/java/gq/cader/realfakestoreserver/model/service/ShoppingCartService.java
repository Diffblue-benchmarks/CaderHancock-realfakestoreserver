package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class ShoppingCartService {

    private ShoppingCartRepository shoppingCartRepository;
    private ProductService productService;
    @Autowired
    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository, ProductService productService) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.productService = productService;
    }


    protected Map<Product, Integer> previewProductQuantityMapForCheckout(ShoppingCart shoppingCart) {
        return Optional.of(shoppingCart.getProductQuantityMap().entrySet()
                .stream()
                .filter(x -> productService.verifyProductInventoryForPreCheckout(x.getKey(), x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)))
                .orElseGet(HashMap::new);
    }

    public void updateShoppingCartProductQuantity(ShoppingCart shoppingCart, Product product, Integer quantity) {
        shoppingCart.getProductQuantityMap().put(product, quantity);
        removeProductsWithZeroQuantity(shoppingCart);
    }

    public void updateShoppingCartProductQuantityByDelta(ShoppingCart shoppingCart, Product product, Integer delta) {

        shoppingCart.getProductQuantityMap().put(product,
                (shoppingCart.getProductQuantityMap().containsKey(product)) ?               //Does key exist?
                        ((shoppingCart.getProductQuantityMap().get(product) + delta))  //If true apply delta
                        :
                        delta);                                  //If new key, put delta as quantity
        removeProductsWithZeroQuantity(shoppingCart);

    }

    public Integer getProductQuantity(ShoppingCart shoppingCart, Product product) {
        return Optional.of(shoppingCart.getProductQuantityMap().get(product))
                .orElse(0);
    }

    public Double getTotalPrice(Customer customer) {
        return getTotalPrice(customer.getShoppingCart());
    }

    public Double getTotalPrice(ShoppingCart shoppingCart) {
        return Optional.of(shoppingCart.getProductQuantityMap().entrySet()
                .stream()
                .flatMapToDouble(
                        x -> DoubleStream.of(
                                x.getKey().getPrice() * x.getValue()))
                .sum())
                .orElse(0.0);
    }

    public void assignShoppingCartToCustomer(Customer customer, ShoppingCart shoppingCart) {
        customer.setShoppingCart(Optional.of(shoppingCart)
                .orElseGet(ShoppingCart::new));
    }

    private void removeProductsWithZeroQuantity(ShoppingCart shoppingCart) {
        shoppingCart.setProductQuantityMap(
                shoppingCart.getProductQuantityMap().entrySet()
                        .stream()
                        .filter(x -> x.getValue() > 0)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

}

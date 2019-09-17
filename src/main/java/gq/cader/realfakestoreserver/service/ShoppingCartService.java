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
    @Autowired
    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.shoppingCart = new ShoppingCart();
    }

    protected void setShoppingCartByCustomerReference(Customer customer) {
        this.shoppingCart = customer.getShoppingCart()
                .orElseGet(ShoppingCart::new);

        this.shoppingCartProductQuantityMap = shoppingCart.getProductQuantityMap();
    }

    protected void setShoppingCartByShoppingCartId(Integer shoppingCartId) {
        this.shoppingCart = shoppingCartRepository.findById(shoppingCartId)
                .orElseGet(ShoppingCart::new);

        this.shoppingCartProductQuantityMap = shoppingCart.getProductQuantityMap();
    }

    public void updateProductQuantity(Product product, Integer quantity) {
        shoppingCartProductQuantityMap.put(product, quantity);
        removeProductsWithZeroQuantity();
    }

    public void updateProductQuantityByDelta(Product product, Integer delta) {

        shoppingCartProductQuantityMap.put(product,
                (shoppingCartProductQuantityMap.containsKey(product)) ?               //Does key exist?
                        ((shoppingCartProductQuantityMap.get(product) + delta))  //If true apply delta
                        :
                        delta);                                  //If new key, put delta as quantity
        removeProductsWithZeroQuantity();

    }

    public Integer getProductQuantity(Product product) {
        return shoppingCartProductQuantityMap.get(product);
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
        customer.setShoppingCart(Optional.of(this.shoppingCart));
    }

    private void removeProductsWithZeroQuantity() {
        this.shoppingCartProductQuantityMap =
                this.shoppingCartProductQuantityMap.entrySet()
                        .stream()
                        .filter(x -> x.getValue() > 0)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

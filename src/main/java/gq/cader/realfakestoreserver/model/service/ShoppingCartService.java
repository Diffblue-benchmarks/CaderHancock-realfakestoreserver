package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class ShoppingCartService {


    public void setProductQuantity(ShoppingCart shoppingCart, @NonNull Product product, @NonNull Integer quantity) {
        if (shoppingCart == null) shoppingCart = new ShoppingCart();

        shoppingCart.getProductQuantityMap().put(product, quantity);
        removeProductsWithZeroQuantity(shoppingCart);
    }

    public void updateProductQuantityByDelta(ShoppingCart shoppingCart, @NonNull Product product, @NonNull Integer delta) {
        if (shoppingCart == null) shoppingCart = new ShoppingCart();

        shoppingCart.getProductQuantityMap().put(product,
                (shoppingCart.getProductQuantityMap().containsKey(product)) ?               //Does key exist?
                        ((shoppingCart.getProductQuantityMap().get(product) + delta))  //If true apply delta
                        :
                        delta);                                  //If new key, put delta as quantity
        removeProductsWithZeroQuantity(shoppingCart);

    }

    public Integer getProductQuantity(@NonNull ShoppingCart shoppingCart, @NonNull Product product) {
        return shoppingCart.getProductQuantityMap()
                .getOrDefault(product, 0);
    }

    public Double getSubtotalPrice(@NonNull ShoppingCart shoppingCart) {
        return shoppingCart.getProductQuantityMap()
                .entrySet()
                .stream()
                .flatMapToDouble(
                        x -> DoubleStream.of(
                                x.getKey().getPrice() * x.getValue()))
                .sum();

    }

    public void assignShoppingCartToCustomer(@NonNull Customer customer, @NonNull ShoppingCart shoppingCart) {
        customer.setShoppingCart(shoppingCart);
    }

    private void removeProductsWithZeroQuantity(ShoppingCart shoppingCart) {
        shoppingCart.setProductQuantityMap(
                shoppingCart.getProductQuantityMap()
                        .entrySet()
                        .stream()
                        .filter(x -> x.getValue() > 0)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

}

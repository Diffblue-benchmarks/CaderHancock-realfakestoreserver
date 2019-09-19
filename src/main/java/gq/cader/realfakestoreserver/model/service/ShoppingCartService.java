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


    @Autowired
    public ShoppingCartService() {

    }


    public void updateProductQuantity(ShoppingCart shoppingCart, Product product, Integer quantity) {
        shoppingCart.getProductQuantityMap().put(product, quantity);
        removeProductsWithZeroQuantity(shoppingCart);
    }

    public void updateProductQuantityByDelta(ShoppingCart shoppingCart, Product product, Integer delta) {

        shoppingCart.getProductQuantityMap().put(product,
                (shoppingCart.getProductQuantityMap().containsKey(product)) ?               //Does key exist?
                        ((shoppingCart.getProductQuantityMap().get(product) + delta))  //If true apply delta
                        :
                        delta);                                  //If new key, put delta as quantity
        removeProductsWithZeroQuantity(shoppingCart);

    }

    public Integer getProductQuantity(ShoppingCart shoppingCart, Product product) {

        Optional<ShoppingCart> optionalShoppingCart = Optional.ofNullable(shoppingCart);
        Optional<Product> optionalProduct = Optional.ofNullable(product);
        if (optionalShoppingCart.isPresent() && optionalProduct.isPresent())
            return Optional.ofNullable(
                    shoppingCart.getProductQuantityMap().get(product))
                    .orElse(0);
        else
            return 0;
    }

    public Double getTotalPrice(ShoppingCart shoppingCart) {
        return Optional.ofNullable(shoppingCart)
                .map(cart -> cart.getProductQuantityMap()
                .entrySet()
                .stream()
                .flatMapToDouble(
                        x -> DoubleStream.of(
                                x.getKey().getPrice() * x.getValue()))
                        .sum())
                .orElse(0.0);
    }

    public void assignShoppingCartToCustomer(Customer customer, ShoppingCart shoppingCart) {
        customer.setShoppingCart(Optional.ofNullable(shoppingCart)
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

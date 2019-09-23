package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class ShoppingCartService {
    private InventoryService inventoryService;

    @Autowired
    public ShoppingCartService(InventoryService inventoryService) {

        this.inventoryService = inventoryService;
    }

    public void setProductQuantity(ShoppingCart shoppingCart, @NonNull Product product, @NonNull Integer quantity) {

        if (shoppingCart == null) shoppingCart = this.getEmptyCart();

        if (inventoryService.verifyProductInventory(product, quantity)) {
            shoppingCart.getProductQuantityMap().put(product, quantity);
            removeProductsWithZeroQuantity(shoppingCart);
        }
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


    private void removeProductsWithZeroQuantity(ShoppingCart shoppingCart) {
        shoppingCart.setProductQuantityMap(
                shoppingCart.getProductQuantityMap()
                        .entrySet()
                        .stream()
                        .filter(x -> x.getValue() > 0)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    public ShoppingCart getEmptyCart() {
        return new ShoppingCart();
    }

}

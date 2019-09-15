package gq.cader.realfakestoreserver;

import lombok.Data;

import java.util.Map;

@Data
public class ShoppingCart {

    private Map<Product, Integer> cart;

    protected void put(Product product, Integer quantity) {
        cart.put(product, (cart.get(product) + quantity));
    }
}

package gq.cader.realfakestoreserver;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ShoppingCart {

    private Map<Product, Integer> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    protected void put(Product product, Integer quantity) {
        cart.put(product, (cart.containsKey(product)) ?
                ((cart.get(product) + quantity))
                :
                quantity);
    }
}

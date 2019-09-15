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

    public void put(Product product, Integer quantity) {

        cart.put(product,
                (cart.containsKey(product)) ?               //Does key exist?
                        (cart.get(product) + quantity > -1) ?      //Will the quantity be non-negative?
                                ((cart.get(product) + quantity))  //If both true increase quantity in cart value
                                :
                                0                               //If sum is negative put value 0
                        :
                        quantity);                                  //If new key, put value quantity
    }
}

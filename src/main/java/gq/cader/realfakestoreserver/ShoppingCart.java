package gq.cader.realfakestoreserver;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ElementCollection(targetClass = Integer.class)
    @MapKeyColumn(name = "Product_In_Cart")
    private Map<Product, Integer> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void put(Product product, Integer quantity) {

        cart.put(product,
                (cart.containsKey(product)) ?               //Does key exist?
                        (cart.get(product) + quantity >= 0) ?      //Will the quantity be non-negative?
                                ((cart.get(product) + quantity))  //If both true increase quantity in cart value
                                :
                                0                               //If sum is negative put value 0
                        :
                        quantity);                                  //If new key, put value quantity
    }
}

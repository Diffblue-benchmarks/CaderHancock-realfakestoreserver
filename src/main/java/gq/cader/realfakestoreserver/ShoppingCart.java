package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ElementCollection(targetClass = Integer.class)
    @MapKeyColumn(name = "PRODUCT")
    private Map<Product, Integer> productQuantityMap;

    public ShoppingCart() {
        productQuantityMap = new HashMap<>();
    }

    public Double getTotalPrice() {
        return productQuantityMap.entrySet()
                .stream()
                .flatMapToDouble(
                        x -> DoubleStream.of(
                                x.getKey().getPrice() * x.getValue()))
                .sum();
    }
    public void put(Product product, Integer quantity) {

        productQuantityMap.put(product,
                (productQuantityMap.containsKey(product)) ?               //Does key exist?
                        (productQuantityMap.get(product) + quantity >= 0) ?      //Will the quantity be non-negative?
                                ((productQuantityMap.get(product) + quantity))  //If both true increase quantity in cart value
                                :
                                0                               //If sum is negative put value 0
                        :
                        quantity);                                  //If new key, put value quantity
    }
}

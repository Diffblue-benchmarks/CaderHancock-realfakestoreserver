package gq.cader.realfakestoreserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
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

    public void updateProductQuantity(Product product, Integer quantity) {
        productQuantityMap.put(product, quantity);
    }
    public void updateProductQuantityByDelta(Product product, Integer quantity) {

        productQuantityMap.put(product,
                (productQuantityMap.containsKey(product)) ?               //Does key exist?
                        ((productQuantityMap.get(product) + quantity))  //If true increase quantity in cart value
                        :
                        quantity);                                  //If new key, put value quantity
        removeProductsWithZeroQuantity();

    }

    private void removeProductsWithZeroQuantity() {
        this.productQuantityMap = this.productQuantityMap.entrySet()
                .stream()
                .filter(x -> x.getValue() > 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

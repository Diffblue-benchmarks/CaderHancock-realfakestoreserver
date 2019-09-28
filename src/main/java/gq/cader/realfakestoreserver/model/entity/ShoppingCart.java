package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

@Data
@Entity
public class ShoppingCart {

    @Id
    @EqualsAndHashCode.Exclude
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ElementCollection(targetClass = Integer.class)
    @MapKeyColumn(name = "PRODUCT")
    private Map<Product, Integer> productQuantityMap;
    @Column(name = "SUBTOTAL")
    private Double subtotal;

    public ShoppingCart() {
        productQuantityMap = new HashMap<>();
    }
    public Double getSubtotal(){
        return productQuantityMap.entrySet().stream()
            .flatMapToDouble(x -> DoubleStream.of(
                x.getKey().getPrice() * x.getValue()))
            .sum();
    }

}

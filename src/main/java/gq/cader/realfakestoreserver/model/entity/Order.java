package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Map;

@Entity
@Table(name = "ORDERS")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @Column(name = "PRODUCTS_IN_ORDER")
    @ElementCollection(targetClass = Integer.class)
    private Map<Product, Integer> productQuantityMap;
    @ManyToOne(targetEntity = Address.class)
    private Address address;
    @Column(name = "TIMESTAMP")
    private Instant timeOrderReceived;
    @Column(name = "SUBTOTAL")
    private Double subTotal;

    //TODO payment details, shipping info
}

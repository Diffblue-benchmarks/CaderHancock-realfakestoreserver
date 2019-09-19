package gq.cader.realfakestoreserver.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.Instant;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;
    @ManyToOne
    @NonNull
    private final Customer customer;
    @NonNull
    private final Map<Product, Integer> productQuantityMap;
    @NonNull
    private final Address address;
    @NonNull
    private final Instant timeOrderReceived;
    @NonNull
    private Double subTotal;
    //TODO payment details, shipping info
}

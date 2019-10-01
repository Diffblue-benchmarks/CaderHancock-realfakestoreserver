package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ORDERS")
@Data
public class Order {
    @Id
    @EqualsAndHashCode.Exclude
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne(cascade= {CascadeType.ALL})
    private  ShoppingCart shoppingCart;
    @ManyToOne(targetEntity = Address.class)
    private  Address address;
    @Column(name = "TIMESTAMP")
    private  Instant timeOrderReceived;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    public Order(){}
    public Order(Integer customerId, ShoppingCart shoppingCart,
                 Address address, Instant instant){

        this.address = address;
        this.shoppingCart= shoppingCart;
        this.timeOrderReceived =   instant;
        this.status = OrderStatus.PENDING;
    }

    //TODO payment details, shipping info
}

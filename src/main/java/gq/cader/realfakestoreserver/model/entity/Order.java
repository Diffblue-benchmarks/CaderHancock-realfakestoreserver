package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ORDERS")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne(cascade= {CascadeType.ALL})
    private  ShoppingCart shoppingCart;
    @ManyToOne(targetEntity = Address.class)
    private  Address address;
    @Column(name = "TIMESTAMP")
    private  Instant timeOrderReceived;

    public Order(){}
    public Order(ShoppingCart shoppingCart,
                 Address address, Instant instant){

        this.address = address;
        this.shoppingCart= shoppingCart;
        this.timeOrderReceived =   instant;
    }

    //TODO payment details, shipping info
}

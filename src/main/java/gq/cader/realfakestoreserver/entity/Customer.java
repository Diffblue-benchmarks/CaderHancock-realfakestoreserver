package gq.cader.realfakestoreserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @OneToOne
    private ShoppingCart shoppingCart;
    @OneToMany(targetEntity = Address.class, fetch = FetchType.EAGER)
    @Column(name = "ADDRESSES")
    private List<Address> addresses;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(targetEntity = Order.class, fetch = FetchType.LAZY)
    private List<Order> orders;
}

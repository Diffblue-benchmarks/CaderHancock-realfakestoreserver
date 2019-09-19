package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @OneToMany
    @Column(name = "ADDRESSES")
    private List<Address> addresses;
    @Column(name = "EMAIL")
    private String email;
    @ElementCollection(targetClass = Order.class)
    @OneToMany(targetEntity = Order.class, fetch = FetchType.LAZY)
    private List<Order> orders;
}

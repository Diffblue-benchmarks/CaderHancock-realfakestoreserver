package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToOne(cascade= {CascadeType.ALL})
    @EqualsAndHashCode.Exclude
    private ShoppingCart shoppingCart;

    @ManyToMany(cascade = {CascadeType.ALL})
    @Column(name = "ADDRESSES")
    @EqualsAndHashCode.Exclude
    private List<Address> addresses;

    //TODO Figure out what annotation needed to
    // force unique or one to one relationship
    @Email
    private String email;

    @ElementCollection(targetClass = Order.class)
    @OneToMany(targetEntity = Order.class, fetch = FetchType.LAZY,
        cascade= {CascadeType.ALL})
    @EqualsAndHashCode.Exclude
    private List<Order> orders;

    public Customer(){
        shoppingCart = new ShoppingCart();
        addresses = new ArrayList<>();
        orders = new ArrayList<>();
    }
}

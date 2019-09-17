package gq.cader.realfakestoreserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

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
    private Optional<ShoppingCart> shoppingCart;
    @OneToMany(targetEntity = Address.class, fetch = FetchType.EAGER)
    @Column(name = "ADDRESSES")
    private List<Address> addresses;
    @Column(name = "EMAIL")
    private String email;
}

package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    @OneToOne
    private ShoppingCart shoppingCart;
    @OneToMany(targetEntity = Address.class, fetch = FetchType.EAGER)
    private List<Address> addresses;
}

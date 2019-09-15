package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private ShoppingCart shoppingCart;
    private List<Address> addresses;
    private Address primaryAddress;
}

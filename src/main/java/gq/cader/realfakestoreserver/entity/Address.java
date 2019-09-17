package gq.cader.realfakestoreserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;
    @Column(name = "CITY")
    private String city;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
}

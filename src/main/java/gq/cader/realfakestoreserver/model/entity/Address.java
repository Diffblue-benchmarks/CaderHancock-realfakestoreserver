package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Address {
    @Id
    @EqualsAndHashCode.Exclude
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

    public Address(String streetAddress, String city, String postalCode,
                   String state, String country){
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
        this.country = country;
    }

}

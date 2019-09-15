package gq.cader.realfakestoreserver;

import lombok.Data;

@Data
public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;
    private String state;
    private String country;
}

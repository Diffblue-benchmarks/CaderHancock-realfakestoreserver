package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
public class Product {
    @Id
    @EqualsAndHashCode.Exclude
    @GeneratedValue(strategy = AUTO)
    private Integer productId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    @EqualsAndHashCode.Exclude
    private Double price;
    @Column(name = "DESCRIPTION")
    @EqualsAndHashCode.Exclude
    private String description;
    @Column(name = "IMGPATH")
    @EqualsAndHashCode.Exclude
    private String imgPath;
    @Column(name = "NUMININVENTORY")
    @EqualsAndHashCode.Exclude
    private int numInInventory;
    @Column(name = "UPC")
    private String UPC;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

}

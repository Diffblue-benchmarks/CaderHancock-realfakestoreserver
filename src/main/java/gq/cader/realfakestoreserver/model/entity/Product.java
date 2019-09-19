package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
public
class Product {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer productId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IMGPATH")
    private String imgPath;
    @Column(name = "NUMININVENTORY")
    private int numInInventory;
    @Column(name = "UPC")
    private String UPC;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

}

package gq.cader.realfakestoreserver.model.entity;

import lombok.Data;

import javax.persistence.*;

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
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

}

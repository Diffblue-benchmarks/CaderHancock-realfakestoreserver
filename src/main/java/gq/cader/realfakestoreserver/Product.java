package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
class Product {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer productId;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "IMGPATH")
    private String imgPath;
    @Column(name = "NUMININVENTORY")
    private int numInInventory;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

}

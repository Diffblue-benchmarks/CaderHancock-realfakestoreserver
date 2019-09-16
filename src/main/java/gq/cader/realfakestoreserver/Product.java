package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer productId;
    private String name;
    private double price;
    private String imgPath;
    private int numInInventory;
    private ProductCategory category;

}

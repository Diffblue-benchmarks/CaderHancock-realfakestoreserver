package gq.cader.realfakestoreserver;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @GeneratedValue(strategy = AUTO)
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "IMG")
    private String imgPath;
    @Column(name = "INVENTORY")
    private int numInInventory;
    @Column(name = "CATEGORIES")
    private List<ProductCategory> categories;

}

package gq.cader.realfakestoreserver;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @GeneratedValue(strategy = AUTO)
    @Id
    private int id;
    private String name;
    private double price;
    private String imgPath;
    private int numInInventory;
    private List<ProductCategory> categories;

}

package gq.cader.realfakestoreserver;

import lombok.Data;

import javax.persistence.GeneratedValue;
import java.util.List;

@Data
public class Product {
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private String imgPath;
    private int numInInventory;
    private List<ProductCategory> categories;

}

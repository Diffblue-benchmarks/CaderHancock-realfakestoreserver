package gq.cader.realfakestoreserver;

import lombok.Data;

import java.util.Map;

@Data
public class ShoppingCart {

    private Map<Product, Integer> cart;
}

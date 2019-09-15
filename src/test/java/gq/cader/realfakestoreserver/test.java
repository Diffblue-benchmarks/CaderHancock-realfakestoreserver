package gq.cader.realfakestoreserver;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class test {

    @Test
    public void testCart() {
        Product p = new Product();
        p.setName("Dildo");
        ShoppingCart shop = new ShoppingCart();
        shop.put(p, 1);
        shop.put(p, 10);
        shop.put(p, -5);
        assertTrue(shop.getCart().get(p).equals(6));
        System.out.println(p.getName());
    }

}

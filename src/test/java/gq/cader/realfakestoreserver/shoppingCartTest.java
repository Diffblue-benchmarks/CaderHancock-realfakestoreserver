package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.entity.ShoppingCart;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class shoppingCartTest {

    @Test
    public void testCart() {
        Product p1 = new Product();
        Product p = new Product();
        p.setName("ok");
        p.setPrice(1.0);
        p1.setName("ko");
        p1.setPrice(1.0);
        ShoppingCart shop = new ShoppingCart();
        shop.put(p, 1);
        shop.put(p, 10);
        shop.put(p, -5);
        shop.put(p1, 1);
        assertTrue(shop.getProductQuantityMap().get(p).equals(6));
        shop.put(p, -7);
        assertTrue(shop.getProductQuantityMap().get(p).equals(0));
        shop.put(p, 1);
        assertTrue(shop.getTotalPrice().doubleValue() == 2.0);
    }

}

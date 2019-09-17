package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.entity.ShoppingCart;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class shoppingCartTest {

    @Test
    public void testCart() {
        Product p1 = new Product();
        Product p = new Product();
        p.setName("ok");
        p.setPrice(1.0);
        p1.setName("ko");
        p1.setPrice(1.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.updateProductQuantityByDelta(p, 1);
        shoppingCart.updateProductQuantityByDelta(p, 10);
        shoppingCart.updateProductQuantityByDelta(p, -5);
        shoppingCart.updateProductQuantityByDelta(p1, 1);
        assertEquals(6, (int) shoppingCart.getProductQuantityMap().get(p));
        shoppingCart.updateProductQuantityByDelta(p, -7);
        assertNull(shoppingCart.getProductQuantityMap().get(p));
        shoppingCart.updateProductQuantityByDelta(p, 1);
        assertEquals(2.0, shoppingCart.getTotalPrice(), 0.0);
    }

}

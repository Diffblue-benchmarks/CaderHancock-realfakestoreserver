package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Product;
import org.junit.Test;

public class ShoppingCartServiceTest {

    @Test
    public void testCart() {
        Product p1 = new Product();
        Product p = new Product();
        p.setName("ok");
        p.setPrice(1.0);
        p1.setName("ko");
        p1.setPrice(1.0);
        /*ShoppingCartService shoppingCart = new ShoppingCartService(new ShoppingCartRepository());
        shoppingCart.updateProductQuantityByDelta(p, 1);
        shoppingCart.updateProductQuantityByDelta(p, 10);
        shoppingCart.updateProductQuantityByDelta(p, -5);
        shoppingCart.updateProductQuantityByDelta(p1, 1);
        assertEquals(6, (int) shoppingCart.getProductQuantity(p));
        shoppingCart.updateProductQuantityByDelta(p, -7);
        assertNull(shoppingCart.getProductQuantity(p));
        shoppingCart.updateProductQuantityByDelta(p, 1);
        assertEquals(2.0, shoppingCart.getTotalPrice(), 0.0);

         */
    }

}

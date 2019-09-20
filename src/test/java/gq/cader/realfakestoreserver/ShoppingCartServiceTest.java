package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartServiceTest {

    @Test
    public void testCart() {
        Product p1 = new Product();
        Product p = new Product();
        ShoppingCart sc = new ShoppingCart();
        p.setName("ok");
        p.setPrice(1.0);
        p1.setName("ko");
        p1.setPrice(1.0);

        ShoppingCartService shoppingCart = new ShoppingCartService();
        shoppingCart.updateProductQuantityByDelta(sc, p, 1);
        shoppingCart.updateProductQuantityByDelta(sc, p, 10);
        shoppingCart.updateProductQuantityByDelta(sc, p, -5);
        shoppingCart.updateProductQuantityByDelta(sc, p1, 1);
        assertEquals(6, (int) shoppingCart.getProductQuantity(sc, p));
        shoppingCart.updateProductQuantityByDelta(sc, p, -7);
        assertEquals(Integer.valueOf(0), shoppingCart.getProductQuantity(sc, p));
        shoppingCart.updateProductQuantityByDelta(sc, p, 1);
        assertEquals(2.0, shoppingCart.getTotalPrice(sc), 0.0);
        assertEquals(Double.valueOf(0.0), shoppingCart.getTotalPrice(null));
        assertEquals(Integer.valueOf(0), shoppingCart.getProductQuantity(null, null));
    }

}

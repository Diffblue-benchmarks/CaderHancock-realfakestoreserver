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

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.updateProductQuantityByDelta(sc, p, 1);
        shoppingCartService.updateProductQuantityByDelta(sc, p, 10);
        shoppingCartService.updateProductQuantityByDelta(sc, p, -5);
        shoppingCartService.updateProductQuantityByDelta(sc, p1, 1);
        assertEquals(6, (int) shoppingCartService.getProductQuantity(sc, p));
        shoppingCartService.updateProductQuantityByDelta(sc, p, -7);
        assertEquals(Integer.valueOf(0), shoppingCartService.getProductQuantity(sc, p));
        shoppingCartService.updateProductQuantityByDelta(sc, p, 1);
        assertEquals(Double.valueOf(2.0), shoppingCartService.getTotalPrice(sc));
        assertEquals(Double.valueOf(0.0), shoppingCartService.getTotalPrice(null));
        assertEquals(Integer.valueOf(0), shoppingCartService.getProductQuantity(null, null));
    }

}

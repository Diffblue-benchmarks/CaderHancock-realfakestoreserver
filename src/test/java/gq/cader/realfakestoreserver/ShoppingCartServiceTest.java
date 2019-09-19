package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.repository.ShoppingCartRepository;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShoppingCartServiceTest {
    @Mock
    private ShoppingCartRepository shoppingCartRepository;
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

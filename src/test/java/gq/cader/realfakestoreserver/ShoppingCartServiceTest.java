package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartServiceTest {

    @Test
    public void testCart() {
        Product product1 = new Product();
        Product product2 = new Product();
        ShoppingCart shoppingCart = new ShoppingCart();
        product2.setName("ok");
        product2.setPrice(1.0);
        product1.setName("ko");
        product1.setPrice(1.0);

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, 1);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, 10);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, -5);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product1, 1);
        assertEquals(6, (int) shoppingCartService.getProductQuantity(shoppingCart, product2));
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, -7);
        assertEquals(Integer.valueOf(0), shoppingCartService.getProductQuantity(shoppingCart, product2));
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, 1);
        assertEquals(Double.valueOf(2.0), shoppingCartService.getTotalPrice(shoppingCart));

    }

}

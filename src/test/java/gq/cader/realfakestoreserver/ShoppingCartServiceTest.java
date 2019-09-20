package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartServiceTest {
    private Product product1 = new Product();
    private Product product2 = new Product();
    private ShoppingCart shoppingCart = new ShoppingCart();
    private ShoppingCartService shoppingCartService = new ShoppingCartService();

    @Before
    public void setup() {
        product1.setPrice(1.0);
        product1.setNumInInventory(99);
        product1.setName("prod1");

        product2.setName("prod2");
        product2.setPrice(1.0);
    }

    @Test
    public void testCart() {


        //Basic Arithmetic Test
        shoppingCartService.setProductQuantity(shoppingCart, product2, 1);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, 10);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, -5);
        assertEquals(6, (int) shoppingCartService.getProductQuantity(shoppingCart, product2));
        //GivenProduct has positive quantity, when reduced to a negative quantity, then returns 0 as quantity
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product2, -7);
        assertEquals(Integer.valueOf(0), shoppingCartService.getProductQuantity(shoppingCart, product2));
        //Given cart with items subtotal is correctly calculated
        shoppingCartService.setProductQuantity(shoppingCart, product2, 1);
        shoppingCartService.setProductQuantity(shoppingCart, product1, 1);
        assertEquals(Double.valueOf(2.0), shoppingCartService.getSubtotalPrice(shoppingCart));

        shoppingCartService.setProductQuantity(shoppingCart, product1, 100);
        shoppingCartService.setProductQuantity(shoppingCart, product2, 100);
        assertEquals(Double.valueOf(200.0), shoppingCartService.getSubtotalPrice(shoppingCart));

        //Given a cart with products, when inventory mutated, then duplicate map keys in cart not created
        product1.setNumInInventory(100);
        shoppingCartService.setProductQuantity(shoppingCart, product1, 99);
        assertEquals(Double.valueOf(199.0), shoppingCartService.getSubtotalPrice(shoppingCart));

        //Test that UpdateByDelta sets a map value for a product that does not exist as a key
        shoppingCartService.setProductQuantity(shoppingCart, product1, -1);
        shoppingCartService.updateProductQuantityByDelta(shoppingCart, product1, 1);
        assertEquals(Integer.valueOf(1), shoppingCartService.getProductQuantity(shoppingCart, product1));

    }

}

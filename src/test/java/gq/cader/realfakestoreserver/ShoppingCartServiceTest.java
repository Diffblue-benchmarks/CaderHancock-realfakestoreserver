package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.exception.ProductInventoryException;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.repository.ProductRepository;
import gq.cader.realfakestoreserver.model.service.InventoryService;
import gq.cader.realfakestoreserver.model.service.ProductService;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(SpringRunner.class)
public class ShoppingCartServiceTest {

    private Product product1 = new Product();
    private Product product2 = new Product();
    private ShoppingCart shoppingCart = new ShoppingCart();

    @MockBean
    private ProductRepository productRepository;
    private ProductService productService =
        Mockito.spy(new ProductService(productRepository));

    private ShoppingCartService shoppingCartService;


    @Before
    public void setup() {

        shoppingCartService = new ShoppingCartService(
            new InventoryService(productService));
        Mockito.doReturn(product1).when(productService).refresh(product1);
        Mockito.doReturn(product2).when(productService).refresh(product2);

        product1.setNumInInventory(99);
        product1.setName("prod1");
        product1.setPrice(1.0);

        product2.setName("prod2");
        product2.setPrice(1.0);
        product2.setNumInInventory(100);
    }

    @Test
    public void testCart() {

        //Given cart with items subtotal is correctly calculated
        shoppingCartService.setProductQuantity(shoppingCart, product2, 1);
        shoppingCartService.setProductQuantity(shoppingCart, product1, 1);
        assertEquals(Double.valueOf(2.0), shoppingCartService
                .getSubtotalPrice(shoppingCart));

        shoppingCartService.setProductQuantity(shoppingCart, product1, 50);
        shoppingCartService.setProductQuantity(shoppingCart, product2, 100);
        assertEquals(Double.valueOf(150.0), shoppingCartService
                .getSubtotalPrice(shoppingCart));

        //Test getProductQuantity
        assertEquals(Integer.valueOf(50),
                shoppingCartService.getProductQuantity(shoppingCart, product1));

        //Given a cart with products, when inventory mutated,
        // then duplicate map keys in cart not created
        product1.setNumInInventory(100);
        shoppingCartService.setProductQuantity(shoppingCart, product1, 99);
        assertEquals(Double.valueOf(199.0), shoppingCartService
                .getSubtotalPrice(shoppingCart));

        //Test that a cart can not add a quantity larger than inventory
        shoppingCart.getProductQuantityMap().clear();
        product1.setNumInInventory(10);
        assertThrows(ProductInventoryException.class,
            () ->
            shoppingCartService.setProductQuantity(
                    shoppingCart, product1, 11));
    }
}

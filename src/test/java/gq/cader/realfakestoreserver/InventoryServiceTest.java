package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.repository.ProductRepository;
import gq.cader.realfakestoreserver.model.service.InventoryService;
import gq.cader.realfakestoreserver.model.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.Set;


@RunWith(SpringJUnit4ClassRunner.class)
public class InventoryServiceTest {

    //We need to stub a protected method for this test, hence the local class
    private class ProductServiceMock extends ProductService{
        public Set<Product> mockRepo;
        public ProductServiceMock(ProductRepository productRepository) {
            super(productRepository);
        }
        @Override
        protected void putUpdatedProduct(Product product){
            if(mockRepo.contains(product)){
                mockRepo.remove(product);
                mockRepo.add(product);
            }else{
                mockRepo.add(product);
            }
        }
    }
    @MockBean
    private ProductRepository productRepository;
    private ProductServiceMock productService =
        Mockito.spy(new ProductServiceMock(productRepository));
    private InventoryService inventoryService =
        new InventoryService(productService);

    private Product product1 = new Product();
    private Product product2 = new Product();
    private Map<Product, Integer> mockShoppingCart;



    @Before
    public void setup(){

        Mockito.doReturn(product1).when(productService).refresh(product1);
        Mockito.doReturn(product2).when(productService).refresh(product2);

        product1.setNumInInventory(99);
        product1.setName("prod1");
        product1.setPrice(1.0);

        product2.setName("prod2");
        product2.setPrice(1.0);
        product2.setNumInInventory(100);

    }

}

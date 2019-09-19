package gq.cader.realfakestoreserver;

import gq.cader.realfakestoreserver.model.repository.CustomerRepository;
import gq.cader.realfakestoreserver.model.repository.ProductRepository;
import gq.cader.realfakestoreserver.model.repository.ShoppingCartRepository;
import gq.cader.realfakestoreserver.model.service.CustomerService;
import gq.cader.realfakestoreserver.model.service.ProductService;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerServiceTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private ProductRepository productRepository;

    private ProductService productService = new ProductService(productRepository);

    private ShoppingCartService shoppingCartService = new ShoppingCartService(shoppingCartRepository, productService);

    private CustomerService customerService = new CustomerService(customerRepository, shoppingCartService);

    @Test
    public void ok() {
        customerService.findAll().stream().forEach(System.out::println);
    }
}

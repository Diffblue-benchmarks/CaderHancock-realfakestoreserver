package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.service.CheckoutService;
import gq.cader.realfakestoreserver.model.service.CustomerService;
import gq.cader.realfakestoreserver.model.service.ProductService;
import gq.cader.realfakestoreserver.model.service.ShoppingCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private static final Logger LOG =
        LoggerFactory.getLogger(CustomerController.class);
    private CustomerService customerService;
    private CheckoutService checkoutService;
    private ProductService productService;
    private ShoppingCartService shoppingCartService;

    @Autowired
    CustomerController(CustomerService customerService,
                       CheckoutService checkoutService,
                       ProductService productService,
                       ShoppingCartService shoppingCartService) {
        this.customerService = customerService;
        this.checkoutService = checkoutService;
        this.productService =productService;
        this.shoppingCartService =shoppingCartService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Customer findByCustomerId(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }

    /*@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer postNewCustomer(@RequestBody Customer customer) {
        return customerService.postNewCustomer(customer);
    }*/
    @GetMapping(value = "/create/{firstName}/{lastName}/{email}")
    public Customer createCustomer(@PathVariable String firstName,
                                   @PathVariable String lastName,
                                   @PathVariable String email){
        return customerService.save(new Customer(firstName, lastName, email));
    }
    @GetMapping(value = "/{customerId}/addToCart/{productId}/{quantity}")
    public Boolean addProductToCart(@PathVariable Integer customerId,
                                    @PathVariable Integer productId,
                                    @PathVariable Integer quantity){
        try{
            Customer customer = customerService.findById(customerId);
            ShoppingCart shoppingCart = customer.getShoppingCart();

            Product product = productService.findById(productId);
            shoppingCartService.setProductQuantity(
                shoppingCart,product,quantity);

            customerService.save(customer);
            return true;
        }catch (Exception e){
            LOG.error(e.getMessage());
            return false;
        }
    }
    @GetMapping(value = "/{id}/checkout")
    public String checkoutCustomer(@PathVariable Integer id){
        Customer customer;
        try{
            customer = customerService.findById(id);
            checkoutService.checkout(customer);
            return "Success";
        }catch(Exception e){
            LOG.error(e.getMessage());
            return e.getMessage();
        }
    }
}

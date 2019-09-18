package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Customer;
import gq.cader.realfakestoreserver.entity.ShoppingCart;
import gq.cader.realfakestoreserver.exception.CustomerNotFoundException;
import gq.cader.realfakestoreserver.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ProductService productService;
    private ShoppingCartService shoppingCartService; //Not final so
    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerService(CustomerRepository customerRepository, ProductService productService, ShoppingCartService shoppingCartService) {
        this.customerRepository = customerRepository;
        this.productService = productService;
        this.shoppingCartService = shoppingCartService;
    }

    void createCustomer(String firstName, String lastName, String email) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setShoppingCart(new ShoppingCart());
        this.postNewCustomer(customer);


    }

    public void checkOutCustomer(Integer customerId) {
        //TODO Implement this
    }

    public Customer findById(Integer customerId) {

        LOG.info("Querying CustomerRepository for ID:" + customerId.toString());
        Optional<Customer> result = customerRepository.findById(customerId);
        return result.orElseGet(() -> {
            throw new CustomerNotFoundException("ID:" + customerId.toString() + " not found.");
        });
    }

    private Customer postNewCustomer(Customer customer) {
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            LOG.warn("Customer: " + customer.toString() + " Already exists");
            return customerRepository.findByEmail(customer.getEmail()).get();
        } else {
            LOG.info("Created Customer: " + customer.toString());
            return customerRepository.save(customer);

        }
    }

}

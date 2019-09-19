package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.CustomerNotFoundException;
import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ShoppingCartService shoppingCartService;
    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerService(CustomerRepository customerRepository, ShoppingCartService shoppingCartService) {
        this.customerRepository = customerRepository;
        this.shoppingCartService = shoppingCartService;
    }

    public Customer createCustomer(String firstName, String lastName, String email) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setShoppingCart(new ShoppingCart());
        return this.postNewCustomer(customer);


    }

    public void checkOutCustomer(Integer customerId) {
        //TODO Implement this
    }

    public List<Customer> findAll() {
        return Optional.of(customerRepository.findAll())
                .orElseGet(() -> {
                    throw new CustomerNotFoundException("There are no Customers in the Database");
                });
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

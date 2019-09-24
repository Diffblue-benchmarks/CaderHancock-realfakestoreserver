package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.CustomerNotFoundException;
import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import gq.cader.realfakestoreserver.model.repository.CustomerRepository;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ShoppingCartService shoppingCartService;
    private static final Logger LOG = LoggerFactory
            .getLogger(CustomerService.class);

    @Autowired
    public CustomerService(CustomerRepository customerRepository,
                           ShoppingCartService shoppingCartService) {

        this.customerRepository = customerRepository;
        this.shoppingCartService = shoppingCartService;
    }

    public Customer createCustomer(
            String firstName, String lastName, String email) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setShoppingCart(new ShoppingCart());
        return this.postNewCustomer(customer);
    }

    public Customer postNewCustomer(Customer customer) {
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            LOG.info("Customer: " + customer.toString() + " Already exists");
            return customerRepository.findByEmail(customer.getEmail()).get();
        } else {
            LOG.info("Created Customer: " + customer.toString());
            return customerRepository.save(customer);
        }
    }

    public void checkOutCustomer(Integer customerId) {
        //TODO Implement this
    }

    public @NonNull List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Integer customerId)
            throws CustomerNotFoundException {

        LOG.info("Querying CustomerRepository for ID:" + customerId.toString());
        return customerRepository.findById(customerId)
                .orElseThrow(CustomerNotFoundException::new);
    }

    public List<Customer> findByFirstName(String name) {
        return customerRepository.findByFirstNameContainsIgnoreCase(name);
    }

    public List<Customer> findByLastName(String name) {
        return customerRepository.findByLastNameContainsIgnoreCase(name);
    }




}

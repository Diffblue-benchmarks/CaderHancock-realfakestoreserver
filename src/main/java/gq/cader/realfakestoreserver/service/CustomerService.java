package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Customer;
import gq.cader.realfakestoreserver.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private ProductService productService;
    private Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerService(CustomerRepository customerRepository, ProductService productService) {
        this.customerRepository = customerRepository;
        this.productService = productService;
    }

    void createCustomer(String firstName, String lastName) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customerRepository.save(customer);
        LOG.info("Created Customer: " + customer.toString());
    }


    public Customer findById(Integer id) {

        LOG.info("Querying CustomerRepository for ID:" + id.toString());
        Optional<Customer> result = customerRepository.findById(id);
        return result.orElseGet(() -> {
            LOG.warn("ID:" + id.toString() + " not found. Returning empty Customer.");
            return new Customer();
        });
    }

}

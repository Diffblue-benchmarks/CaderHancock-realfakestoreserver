package gq.cader.realfakestoreserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    void createCustomer(String firstName, String lastName) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customerRepository.save(customer);
    }

    Customer findById(Integer id) {
        Optional<Customer> result = customerRepository.findById(id);
        return result.orElseGet(Customer::new);
    }

}

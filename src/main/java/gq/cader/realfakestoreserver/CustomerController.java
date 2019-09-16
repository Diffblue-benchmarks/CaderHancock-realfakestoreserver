package gq.cader.realfakestoreserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "findByCustomerId/{id}", produces = "application/json")
    public Customer findByCustomerId(@PathVariable Integer id) {
        Optional<Customer> result = customerRepository.findById(id);
        return result.orElse(null);
    }
}

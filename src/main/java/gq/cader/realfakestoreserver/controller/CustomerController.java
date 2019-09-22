package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "findByCustomerId/{id}", produces = "application/json")
    public Customer findByCustomerId(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @PostMapping("/")
    public Customer postNewCustomer(@RequestBody Customer customer) {
        return customerService.postNewCustomer(customer);
    }
}

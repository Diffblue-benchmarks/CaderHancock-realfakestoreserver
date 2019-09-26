package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.service.CheckoutService;
import gq.cader.realfakestoreserver.model.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG =
        LoggerFactory.getLogger(CustomerController.class);
    private CustomerService customerService;
    private CheckoutService checkoutService;

    @Autowired
    CustomerController(CustomerService customerService,
                       CheckoutService checkoutService) {
        this.customerService = customerService;
        this.checkoutService = checkoutService;
    }

    @GetMapping(value = "findByCustomerId/{id}", produces = "application/json")
    public Customer findByCustomerId(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @PostMapping("/")
    public Customer postNewCustomer(@RequestBody Customer customer) {
        return customerService.postNewCustomer(customer);
    }
    @GetMapping(value = "checkout/{id}")
    public Boolean checkoutCustomer(@PathVariable Integer id){
        Customer customer;
        try{
            customer = customerService.findById(id);
           checkoutService.checkout(customer);
            return true;
        }catch(Exception e){
            LOG.error(e.getMessage());
            return false;
        }
    }
}

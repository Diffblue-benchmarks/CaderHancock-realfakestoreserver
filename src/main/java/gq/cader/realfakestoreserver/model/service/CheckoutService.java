package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.CheckoutFailedException;
import gq.cader.realfakestoreserver.exception.
    CustomerAddressMissingAtCheckoutException;
import gq.cader.realfakestoreserver.exception.
    CustomerAddressNotSelectedAtCheckoutException;
import gq.cader.realfakestoreserver.model.entity.Address;
import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Order;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Map;

@Service
public class CheckoutService {

    private static final Logger LOG = LoggerFactory
        .getLogger(CheckoutService.class);
    private final InventoryService inventoryService;
    private final CustomerService customerService;


    @Autowired
    public CheckoutService(InventoryService inventoryService,
                           CustomerService customerService){
        this.inventoryService = inventoryService;
        this.customerService =  customerService;
    }



    public void checkout(Customer customer) throws
        CustomerAddressMissingAtCheckoutException,
        CustomerAddressNotSelectedAtCheckoutException,
        CheckoutFailedException {

        if (customer.getAddresses() == null ||
            customer.getAddresses().isEmpty()){

            throw new CustomerAddressMissingAtCheckoutException("Address " +
                "Missing");

        }else if(customer.getAddresses().size() > 1){

            throw new CustomerAddressNotSelectedAtCheckoutException("Address " +
                "Not Selected");

        }
        checkout(customer, customer.getAddresses().get(0));
    }
    public void checkout (Customer customer, Address address)
        throws CheckoutFailedException {

        Instant timestamp =  Instant.now();
        Map<Product, Integer> orderProductQuantityMap =
            customer.getShoppingCart().getProductQuantityMap();
        if(orderProductQuantityMap.isEmpty()){
            throw new CheckoutFailedException("Cannot Checkout Empty Cart");
        }
        //TODO implement payment system and execute here
        inventoryService.reduceProductInventoryByDelta(orderProductQuantityMap);

        Order order = new Order(customer.getCustomerId().intValue(),
            customer.getShoppingCart(),address,
            timestamp);
        customer.getOrders().add(order);
        customer.setShoppingCart(new ShoppingCart());
        customerService.save(customer);
        LOG.info("Customer:" + customer.getCustomerId() + " successfully " +
            "checked out");


    }
}

package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.CustomerAddressMissingAtCheckoutException;
import gq.cader.realfakestoreserver.exception.CustomerAddressNotSelectedAtCheckoutException;
import gq.cader.realfakestoreserver.exception.ProductInventoryException;
import gq.cader.realfakestoreserver.model.entity.Address;
import gq.cader.realfakestoreserver.model.entity.Customer;
import gq.cader.realfakestoreserver.model.entity.Order;
import gq.cader.realfakestoreserver.model.entity.Product;
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

    @Autowired
    public CheckoutService(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }



    public void checkout(Customer customer) throws
        CustomerAddressMissingAtCheckoutException,
        CustomerAddressNotSelectedAtCheckoutException,
        ProductInventoryException {

        if (customer.getAddresses().size() == 1){
            checkout(customer, customer.getAddresses().get(0));
        }else if(customer.getAddresses().size() > 1){
            throw new CustomerAddressNotSelectedAtCheckoutException();
        }else if (customer.getAddresses() == null){
            throw new CustomerAddressMissingAtCheckoutException();
        }
    }
    public Order checkout (Customer customer, Address address)
        throws ProductInventoryException{

        Instant timestamp =  Instant.now();
        Map<Product, Integer> orderProductQuantityMap =
            customer.getShoppingCart().getProductQuantityMap();
        //TODO implement payment system and execute here
        inventoryService.reduceProductInventoryByDelta(orderProductQuantityMap);

        Order order = new Order(customer,orderProductQuantityMap,address,
            timestamp);
        customer.getOrders().add(order);
        LOG.info("Customer:" + customer.getCustomerId() + " successfully " +
            "checked out");
        return order; //to the universe


    }
}

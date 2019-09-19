package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.ProductInventoryException;
import gq.cader.realfakestoreserver.exception.ProductNotFoundException;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private ProductService productService;

    @Autowired
    public InventoryService(ProductService productService) {
        this.productService = productService;
    }

    protected Product reduceProductInventoryByDelta(
            Integer productId, Integer delta)
            throws ProductNotFoundException, ProductInventoryException {

        Product product = Optional.of(productService.findById(productId))
                .orElseThrow(ProductNotFoundException::new);

        if (product.getNumInInventory() >= delta) {

            product.setNumInInventory(product.getNumInInventory() - delta);
            productService.putUpdatedProduct(product);
            return product;

        } else {
            throw new ProductInventoryException("Product ID:"
                    + product.getProductId() + ": " + product.getName()
                    + " is not in sufficient stock to reduce inventory by " + delta.toString());
        }

    }

    protected Map<Product, Integer> previewProductQuantityMapForCheckout(ShoppingCart shoppingCart) {
        return Optional.of(shoppingCart.getProductQuantityMap().entrySet()
                .stream()
                .filter(x -> verifyProductInventory(x.getKey(), x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)))
                .orElseGet(HashMap::new);
    }

    private Boolean verifyProductInventory(Product product, Integer quantity) throws ProductInventoryException {
        if (product.getNumInInventory() >= quantity)
            return true;
        else
            throw new ProductInventoryException();


    }
}

package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.exception.ProductNotFoundException;
import gq.cader.realfakestoreserver.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Integer id) {

        LOG.info("Querying ProductRepository for productId:" + id);
        return productRepository.findByProductId(id)
                .orElseThrow(ProductNotFoundException::new);

    }

    public Product postNewProduct(Product product) {
        return (productRepository.findByName(product.getName()).isPresent()) ?
                productRepository.findByName(product.getName()).get()
                :
                productRepository.save(product);
    }

    public List<Product> findByNameContains(String query) {
        LOG.info("Querying ProductRepository for partial name: " + query);
        return productRepository.findByNameContainsIgnoreCase(query)
                .orElseThrow(ProductNotFoundException::new);

    }

    public Product reduceProductInventoryByDelta(Integer productId, Integer delta) {
        Product product = productRepository.findByProductId(productId).orElseThrow(ProductNotFoundException::new);
        product.setNumInInventory(product.getNumInInventory() - delta);
        productRepository.save(product);
        return product;
    }
}

package gq.cader.realfakestoreserver.model.service;

import gq.cader.realfakestoreserver.exception.ProductNotFoundException;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.repository.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Integer id) throws ProductNotFoundException {
        LOG.info("Querying ProductRepository for productId:" + id);
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    public Product postNewProduct(Product product) {
        return (productRepository.findByName(product.getName()).isPresent()) ?
                productRepository.findByName(product.getName()).get()
                :
                productRepository.save(product);
    }

    protected Product putUpdatedProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findByNameContains(String query) {
        LOG.info("Querying ProductRepository for partial name: " + query);
        return productRepository.findByNameContainsIgnoreCase(query)
                .orElseThrow(ProductNotFoundException::new);

    }




}

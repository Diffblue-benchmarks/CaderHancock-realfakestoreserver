package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private Logger LOG = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Integer id) {

        LOG.info("Querying ProductRepository for productId:" + id);
        Optional<Product> result = productRepository.findByProductId(id);
        return result.orElseGet(() -> {
            LOG.warn("ID:" + id.toString() + " not found. Returning empty Product.");
            return new Product();
        });
    }
}

package gq.cader.realfakestoreserver.service;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.exception.ProductNotFoundException;
import gq.cader.realfakestoreserver.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Optional<Product> result = productRepository.findByProductId(id);
        return result.orElseGet(() -> {
            LOG.warn("ID:" + id.toString() + " not found. Returning empty Product.");
            return new Product();
        });

    }

    public Product postNewProduct(Product product) {
        return (productRepository.findByName(product.getName()).isPresent()) ?
                productRepository.findByName(product.getName()).get()
                :
                productRepository.save(product);
    }

    public List<Product> findByPartialString(String query) {
        LOG.info("Searching for " + query);
        return Optional.of(productRepository.findAll()
                .stream()
                .filter(x -> x.getName()
                        .toLowerCase()
                        .contains(query.toLowerCase()))
                .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                .collect(Collectors.toList()))
                .orElseThrow(ProductNotFoundException::new);
    }
}

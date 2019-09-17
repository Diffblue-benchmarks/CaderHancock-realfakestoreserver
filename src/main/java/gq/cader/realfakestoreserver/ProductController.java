package gq.cader.realfakestoreserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @GetMapping(value = "/findByProductId/{id}", produces = "application/json")
    public Product findByProductId(@PathVariable Integer id) {
        LOG.info("Searching for productId " + id);

        Optional<Product> result = productRepository.findByProductId(id);
        return result.orElse(null);

    }
//    @PutMapping(value = "/putProduct")

    @GetMapping(value = "/findByPartialString/{query}", produces = "application/json")
    public List<Product> findByPartialString(@PathVariable String query) {
        LOG.info("Searching for " + query);
        return productRepository.findAll()
                .stream()
                .filter(x -> x.getName()
                        .toLowerCase()
                        .contains(query.toLowerCase()))
                .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                .collect(Collectors.toList());
    }

}

package gq.cader.realfakestoreserver;

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

    @GetMapping(value = "/findByProductId/{id}", produces = "application/json")
    public Product findByProductId(@PathVariable Integer id) {
        Optional<Product> result = productRepository.findByProductId(id);
        return result.orElse(null);

    }

    @GetMapping(value = "/findByPartialString/{query}", produces = "application/json")
    public List<Product> findByPartialString(@PathVariable String query) {
        return productRepository.findAll()
                .stream()
                .filter(x -> x.getName()
                        .toLowerCase()
                        .contains(query.toLowerCase()))
                .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                .collect(Collectors.toList());
    }

}

package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.exception.ProductNotFoundException;
import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private ProductService productService;
    private static final Logger LOG = LoggerFactory
            .getLogger(ProductController.class);

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public Product findByProductId(@PathVariable Integer id) {

        return productService.findById(id);
    }

    @GetMapping(value = "/search/{query}", produces = "application/json")
    public List<Product> findByNameContains(@PathVariable String query) {
        try {
            return productService.findByNameContains(query);
        } catch (ProductNotFoundException e) {
            LOG.warn(e.toString());
            return null;
        }
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @PostMapping(value = "/", consumes = "application/json")
    public Product postNewProduct(@RequestBody Product product) {
        LOG.info("POSTing new " + product.toString());
        return productService.postNewProduct(product);
    }


}

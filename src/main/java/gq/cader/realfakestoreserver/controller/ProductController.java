package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private Logger LOG = LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value = "/findByProductId/{id}", produces = "application/json")
    public Product findByProductId(@PathVariable Integer id) {

        return productService.findById(id);
    }

    @GetMapping(value = "/search/{query}", produces = "application/json")
    public List<Product> findByNameContains(@PathVariable String query) {
        return productService.findByNameContains(query);
    }

    @PostMapping("/")
    public Product postNewProduct(@RequestBody Product product) {
        return productService.postNewProduct(product);
    }


}

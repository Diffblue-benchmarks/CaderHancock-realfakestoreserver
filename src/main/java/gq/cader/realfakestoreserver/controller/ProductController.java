package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.model.entity.Product;
import gq.cader.realfakestoreserver.model.service.ProductService;
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

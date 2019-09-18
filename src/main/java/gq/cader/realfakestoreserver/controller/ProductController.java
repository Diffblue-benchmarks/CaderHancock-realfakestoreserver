package gq.cader.realfakestoreserver.controller;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.repository.ProductRepository;
import gq.cader.realfakestoreserver.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private ProductRepository productRepository;
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

    @PutMapping(value = "/reduceInventory{id}", produces = "application/json")
    public @ResponseBody
    Product reduceProductInventoryByDelta(@PathVariable("id") Integer productId, @RequestParam(name = "delta") Integer delta) {
        return productService.reduceProductInventoryByDelta(productId, delta);
    }

}

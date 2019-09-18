package gq.cader.realfakestoreserver.repository;

import gq.cader.realfakestoreserver.entity.Product;
import gq.cader.realfakestoreserver.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByProductId(Integer id);

    Optional<List<Product>> findByCategory(ProductCategory category);

    Optional<Product> findByName(String name);

    Optional<List<Product>> findByNameContainsIgnoreCase(String query);
}




package gq.cader.realfakestoreserver;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByProductId(Integer id);

    Optional<List<Product>> findByCategory(ProductCategory category);

    List<Product> findAll();

    Optional<List<Product>> findByName(String name);
}




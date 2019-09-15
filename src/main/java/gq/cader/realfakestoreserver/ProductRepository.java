package gq.cader.realfakestoreserver;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends Repository {

    Optional<Product> getByProductId(Integer id);

    Optional<List<Product>> getByCategory(ProductCategory category);

    @Query("SELECT p FROM PRODUCTS")
    Optional<List<Product>> getAll();

    /**
     * @param name Partial or Complete name of Product
     * @return Optional List of all matches
     */
    @Query("SELECT p FROM  PRODUCTS p WHERE LOWER(p.name) LIKE :name")
    Optional<List<Product>> getByName(String name);


}

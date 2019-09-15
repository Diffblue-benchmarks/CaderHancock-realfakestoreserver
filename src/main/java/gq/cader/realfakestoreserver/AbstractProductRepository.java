package gq.cader.realfakestoreserver;

import java.util.List;
import java.util.Optional;

public abstract class AbstractProductRepository {

    public abstract Optional<Product> getByProductId(Integer id);

    public abstract Optional<List<Product>> getByCategory(ProductCategory category);

    public abstract Optional<List<Product>> getAll();

    /**
     * @param name Partial or Complete name of Product
     * @return Optional List of all matches
     */
    public abstract Optional<List<Product>> getByName(String name);


}

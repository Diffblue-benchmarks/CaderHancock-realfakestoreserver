package gq.cader.realfakestoreserver.model.repository;

import gq.cader.realfakestoreserver.model.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}

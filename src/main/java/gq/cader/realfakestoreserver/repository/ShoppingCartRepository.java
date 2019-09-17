package gq.cader.realfakestoreserver.repository;

import gq.cader.realfakestoreserver.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}

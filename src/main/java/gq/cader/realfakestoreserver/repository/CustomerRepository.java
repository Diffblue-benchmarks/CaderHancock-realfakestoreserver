package gq.cader.realfakestoreserver.repository;

import gq.cader.realfakestoreserver.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

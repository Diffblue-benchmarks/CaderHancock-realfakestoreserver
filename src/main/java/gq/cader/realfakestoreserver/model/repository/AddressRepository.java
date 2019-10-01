package gq.cader.realfakestoreserver.model.repository;

import gq.cader.realfakestoreserver.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}

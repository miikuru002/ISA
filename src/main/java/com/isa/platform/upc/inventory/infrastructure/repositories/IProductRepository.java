package com.isa.platform.upc.inventory.infrastructure.repositories;

import com.isa.platform.upc.inventory.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findBySerialNumber(String serialNumber);
}

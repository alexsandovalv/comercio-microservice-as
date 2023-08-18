package com.coding.as.productservice.repositories;

import com.coding.as.productservice.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

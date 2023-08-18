package com.coding.as.orderservice.repositories;

import com.coding.as.orderservice.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

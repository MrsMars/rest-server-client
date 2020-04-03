package com.aoher.repository;

import com.aoher.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Integer> {
    List<Order> findByProductName(String productName);
}

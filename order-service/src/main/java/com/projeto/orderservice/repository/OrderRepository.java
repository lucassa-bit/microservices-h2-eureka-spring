package com.projeto.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

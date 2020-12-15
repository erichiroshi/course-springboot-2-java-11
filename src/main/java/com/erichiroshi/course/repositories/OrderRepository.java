package com.erichiroshi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

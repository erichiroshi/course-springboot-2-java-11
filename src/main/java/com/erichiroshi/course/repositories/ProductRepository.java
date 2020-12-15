package com.erichiroshi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

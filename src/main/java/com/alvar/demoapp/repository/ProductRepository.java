package com.alvar.demoapp.repository;

import com.alvar.demoapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
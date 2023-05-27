package com.example.demo_ck_www1.repositories;

import com.example.demo_ck_www1.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(long id);
}

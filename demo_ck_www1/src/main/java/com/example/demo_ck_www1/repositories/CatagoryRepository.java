package com.example.demo_ck_www1.repositories;

import com.example.demo_ck_www1.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CatagoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findById(long id);
}

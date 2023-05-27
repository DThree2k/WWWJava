package vn.edu.iuh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.models.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}

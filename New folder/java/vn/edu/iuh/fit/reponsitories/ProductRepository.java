package vn.edu.iuh.fit.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
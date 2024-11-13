package com.order_backend_application.order_product.repository;

import com.order_backend_application.order_product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

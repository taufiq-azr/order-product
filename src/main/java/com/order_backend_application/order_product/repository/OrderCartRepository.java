package com.order_backend_application.order_product.repository;

import com.order_backend_application.order_product.model.OrderCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCartRepository extends JpaRepository<OrderCart, Long> {
}

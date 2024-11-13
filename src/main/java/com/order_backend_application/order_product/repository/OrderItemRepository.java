package com.order_backend_application.order_product.repository;

import com.order_backend_application.order_product.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

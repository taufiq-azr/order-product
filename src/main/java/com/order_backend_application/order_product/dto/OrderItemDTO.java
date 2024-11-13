package com.order_backend_application.order_product.dto;

import com.order_backend_application.order_product.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDTO {

    private Long id;
    private Product product;
    private int quantity;
    private Double totalPrice;

}

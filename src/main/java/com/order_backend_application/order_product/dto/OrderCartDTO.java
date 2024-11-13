package com.order_backend_application.order_product.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderCartDTO {

    private Long id;
    private String customerName;
    private String address;
    private List<OrderItemDTO> items;
}

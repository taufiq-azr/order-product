package com.order_backend_application.order_product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String productName;
    private String type;
    private Double price;
    private String supplier;
}

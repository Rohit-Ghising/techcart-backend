package com.example.ecom.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductCreateDto {

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private List<String> colors;
}

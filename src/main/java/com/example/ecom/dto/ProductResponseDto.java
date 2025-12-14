package com.example.ecom.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductResponseDto {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private List<String> colors;
    private List<String> imageUrls;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

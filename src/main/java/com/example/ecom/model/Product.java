package com.example.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    private Integer stock;

    // Multiple images
    @ElementCollection
    @CollectionTable(
            name = "product_images",
            joinColumns = @JoinColumn(name = "product_id")
    )
    @Column(name = "image_url")
    private List<String> imageUrls = new ArrayList<>();

    // Multiple colors
    @ElementCollection
    @CollectionTable(
            name = "product_colors",
            joinColumns = @JoinColumn(name = "product_id")
    )
    @Column(name = "color")
    private List<String> colors = new ArrayList<>();

    @Column(nullable = false)
    private Boolean active = true;
    @Column(nullable = false)
    private Double averageRating = 0.0; // Average of all ratings

    @Column(nullable = false)
    private Integer numberOfRatings = 0; // Count of ratings



    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}

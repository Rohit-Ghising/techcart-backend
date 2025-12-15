package com.example.ecom.service;

import com.example.ecom.dto.ProductCreateDto;

import com.example.ecom.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    Product addProducts(ProductCreateDto dto, List<MultipartFile> images) throws IOException;
    List<Product> getAllProducts();
    Product getProductById(Long id);



    void deleteProduct(Long id);

    Product updateProduct(Long id, ProductCreateDto dto);
}

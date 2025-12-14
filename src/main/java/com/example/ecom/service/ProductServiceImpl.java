package com.example.ecom.service;

import com.example.ecom.dto.ProductCreateDto;

import com.example.ecom.model.Product;
import com.example.ecom.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productrepo;
//    private final ImageUploadService imageUploadService;
    public ProductServiceImpl(ProductRepository productrepo){
        this.productrepo =productrepo;
    }

    @Override
    public Product addProducts(ProductCreateDto dto, List<MultipartFile> images) throws IOException {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setColors(dto.getColors());

        product.setActive(true);
        return productrepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }


}

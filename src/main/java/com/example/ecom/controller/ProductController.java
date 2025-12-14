package com.example.ecom.controller;

import com.example.ecom.dto.ProductCreateDto;

import com.example.ecom.model.Product;
import com.example.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductController {
    @Autowired
 private ProductService productService ;

    @PostMapping("/add")
    public ResponseEntity<Product>addProduct(@RequestBody ProductCreateDto productDto){
        Product savedProduct = productService.addProducts();

        return ResponseEntity.ok(savedProduct);
    }
    @GetMapping()
    public  ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products =productService.getAllProducts();
        return  ResponseEntity.ok(products);


    }
    @GetMapping("/{id}")
    public  ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product product = productService.getProductById(id);
        if(product == null)
            return ResponseEntity.notFound().build();
        return  ResponseEntity.ok(product);

    }

}

package com.example.ecom.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dlpz4paat",
                "api_key", "158411989246639",
                "api_secret", "MDIgUBLZLXeTBdRcf2Z39eeoMl8"
        ));
    }
}

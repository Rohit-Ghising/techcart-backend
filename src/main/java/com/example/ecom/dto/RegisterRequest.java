package com.example.ecom.dto;

import com.example.ecom.model.Role;
import lombok.Data;


@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}

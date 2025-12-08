package com.example.ecom.service;

import com.example.ecom.dto.LoginRequest;
import com.example.ecom.dto.RegisterRequest;
import com.example.ecom.model.User;

public interface UserService {
    User  register(RegisterRequest registerRequest);
    User login(LoginRequest loginRequest);
}

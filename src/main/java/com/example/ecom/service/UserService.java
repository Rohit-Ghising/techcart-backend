package com.example.ecom.service;

import com.example.ecom.dto.AuthResponse;
import com.example.ecom.dto.LoginRequest;
import com.example.ecom.dto.RegisterRequest;

public interface UserService {
    AuthResponse register(RegisterRequest registerRequest);
    AuthResponse login(LoginRequest loginRequest);
}

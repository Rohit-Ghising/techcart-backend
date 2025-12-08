package com.example.ecom.service;

import com.example.ecom.model.User;

public interface UserService {
    User  register(User user);
    User login(String email, String password);
}

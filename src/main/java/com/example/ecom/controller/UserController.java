package com.example.ecom.controller;

import com.example.ecom.dto.LoginRequest;
import com.example.ecom.dto.RegisterRequest;
import com.example.ecom.model.User;
import com.example.ecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/auth/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest registerRequest){
        return   userService.register(registerRequest);
    }

    @PostMapping("/login")

    public  User login (@RequestBody LoginRequest request){
        return  userService.login(request);
    }
}

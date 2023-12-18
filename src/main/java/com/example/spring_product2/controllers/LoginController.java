package com.example.spring_product2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public String showLoginPage() {
        return "login-page";
    }
}

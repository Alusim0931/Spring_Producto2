package com.example.spring_product2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String showHome() {
        return "home";
    }
    @GetMapping("/admin")
    public String showAdmin() {
        return "admin";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }

}

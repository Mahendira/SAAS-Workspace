package com.example.springbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/basic")
    public String getBasicApi() {
        return "This is the BASIC API endpoint.";
    }

    @GetMapping("/medium")
    public String getMediumApi() {
        return "This is the MEDIUM API endpoint.";
    }

    @GetMapping("/advanced")
    public String getAdvancedApi() {
        return "This is the ADVANCED API endpoint.";
    }
}

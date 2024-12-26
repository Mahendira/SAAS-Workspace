package com.example.springbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
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

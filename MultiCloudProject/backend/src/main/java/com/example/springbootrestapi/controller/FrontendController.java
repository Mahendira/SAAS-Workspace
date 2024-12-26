package com.example.springbootrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/")
    public String forwardRoot() {
        return "forward:/index.html"; // Serve the React app's entry point
    }
}

package com.example.springbootrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/{path:^(?!api|auth|database).*}")
    public String redirect() {
        // Forward to React's index.html for non-API routes
        return "forward:/index.html";
    }
}

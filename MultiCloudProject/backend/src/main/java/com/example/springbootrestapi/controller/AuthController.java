package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.entity.User;
import com.example.springbootrestapi.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class AuthController {

    private final UserService userService;

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExpiration;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/auth/login/success")
    public Map<String, String> googleLoginSuccess(OAuth2AuthenticationToken authentication) {
        System.out.println("Authentication object: " + authentication);

        if (authentication == null) {
            throw new RuntimeException("User is not authenticated");
        }

        String email = authentication.getPrincipal().getAttribute("email");
        String name = authentication.getPrincipal().getAttribute("name");

        // Return success response
        return Map.of(
                "message", "Login successful",
                "email", email,
                "name", name
        );
    }


    private String generateToken(String username, String role) {
        return Jwts.builder()
                .setSubject(username)
                .claim("roles", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
}

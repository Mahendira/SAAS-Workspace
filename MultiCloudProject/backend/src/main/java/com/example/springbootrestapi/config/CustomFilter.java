package com.example.springbootrestapi.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Custom logic before the request is processed
        System.out.println("Custom Filter executed for request: " + request);

        // Ensure the filter chain is properly continued
        chain.doFilter(request, response);

        // Custom logic after the request is processed (optional)
    }
}

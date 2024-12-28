package com.example.springbootrestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/auth/login/success").permitAll() // Allow access without authentication
                        .requestMatchers("/").permitAll() // Allow access without authentication
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth2 -> oauth2
                        //.defaultSuccessUrl("/auth/login/success", true) // Redirect after login
                        .defaultSuccessUrl("/", true) // Redirect after login
                );
        return http.build();
    }

}

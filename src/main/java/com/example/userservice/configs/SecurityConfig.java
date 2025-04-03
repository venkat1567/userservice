package com.example.userservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  /*  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().anyRequest().permitAll()
   /*             .and().csrf((c) -> c.disable());

        return http.build();
    }*/

  /*  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection (optional for APIs)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Allow all requests
                );

        return http.build();
    }*/
}

package com.example.userservice.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scaler.userservice.dtos.SignUpResponseDto;
import com.scaler.userservice.dtos.SignUpRequestDto;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/sign_up")
    public SignUpResponseDto signUp(SignUpRequestDto request) {
        return null;
    }

    @PostMapping("/login")
    public String login() {
        return "This is from Login Post Mapping";
    }

}

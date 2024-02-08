package com.pharmatest.pharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmatest.pharma.model.SignupData;
import com.pharmatest.pharma.service.SignupService;

@Controller
public class SignupController {
    private final SignupService signupService;

    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @GetMapping("/signup")
    public String showSignupForm(SignupData signupData) {
        return "signup"; // This will render signup.html using Thymeleaf
    }

    @PostMapping("/signup")
    public String processSignup(SignupData signupData) {
        signupService.saveSignupData(signupData);
        return "redirect:/login"; // Redirect to login page after signup
    }
}

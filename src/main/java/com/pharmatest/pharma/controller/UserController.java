package com.pharmatest.pharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pharmatest.pharma.model.User;
import com.pharmatest.pharma.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login") // Handles GET request for the login page
    public String showLoginPage() {
        return "login"; // Renders login.html
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
    User user = userService.findByUsername(username);
    
    System.out.println("Received username: " + username);
    System.out.println("Retrieved user from DB: " + user);
    
    if (user != null && user.getPassword().equals(password)) {
        System.out.println("Login successful for user: " + username);
        if (username.equals("admin")) {
            return "redirect:/db.html"; // Redirect to admin dashboard
        } else if (username.equals("doctor")) {
            return "redirect:/dbd.html"; // Redirect to doctor page
        } else {
            return "redirect:/indexl.html"; // Redirect to regular user page
        }
    } else {
        System.out.println("Login failed for user: " + username);
        return "redirect:/login?error=true"; // Redirect back to login page with error parameter
    }
}


}

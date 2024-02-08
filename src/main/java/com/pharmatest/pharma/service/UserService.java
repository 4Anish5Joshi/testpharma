package com.pharmatest.pharma.service;

import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.User;
import com.pharmatest.pharma.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    
}

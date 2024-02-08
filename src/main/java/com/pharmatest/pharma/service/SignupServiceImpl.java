package com.pharmatest.pharma.service;

import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.SignupData;
import com.pharmatest.pharma.repositories.SignupRepository;

@Service
public class SignupServiceImpl implements SignupService {
    private final SignupRepository signupRepository;

    public SignupServiceImpl(SignupRepository signupRepository) {
        this.signupRepository = signupRepository;
    }

    @Override
    public void saveSignupData(SignupData signupData) {
        // You'll have implementation to process and save the signup data
        signupRepository.save(signupData);
    }

    // Other methods related to signup functionality 
}

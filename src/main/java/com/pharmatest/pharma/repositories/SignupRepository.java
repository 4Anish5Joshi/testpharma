package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmatest.pharma.model.SignupData;

public interface SignupRepository extends JpaRepository<SignupData, Long> {
    // Custom query methods if needed 
}
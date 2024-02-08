package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmatest.pharma.model.LabTest;

public interface LabTestRepository extends JpaRepository<LabTest, Long> {
    
}

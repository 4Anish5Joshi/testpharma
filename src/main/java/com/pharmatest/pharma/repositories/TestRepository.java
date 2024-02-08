package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmatest.pharma.model.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
    // Additional custom queries if needed
}

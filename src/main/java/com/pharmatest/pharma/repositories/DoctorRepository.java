package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmatest.pharma.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    
}
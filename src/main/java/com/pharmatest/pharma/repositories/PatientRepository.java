package com.pharmatest.pharma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmatest.pharma.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
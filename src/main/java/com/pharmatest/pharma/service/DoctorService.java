package com.pharmatest.pharma.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.Doctor;
import com.pharmatest.pharma.repositories.DoctorRepository;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;


    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Other methods for additional operations...
}

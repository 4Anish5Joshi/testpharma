package com.pharmatest.pharma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.Patient;
import com.pharmatest.pharma.repositories.PatientRepository;



@Service
public class PatientService {

    @Autowired
	private PatientRepository patientRepository;

	
	
	public void saveImage(Patient patient) {
		patientRepository.save(patient);	
	}

	public List<Patient> getAllActiveImages() {
		return patientRepository.findAll();
	}

	public Optional<Patient> getImageById(Long id) {
		return patientRepository.findById(id);
	}
    
	public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }
}

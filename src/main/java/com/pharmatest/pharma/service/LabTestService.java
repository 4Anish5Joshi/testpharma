package com.pharmatest.pharma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.LabTest;
import com.pharmatest.pharma.repositories.LabTestRepository;

@Service
public class LabTestService {

    private final LabTestRepository labTestRepository;

    public LabTestService(LabTestRepository labTestRepository) {
        this.labTestRepository = labTestRepository;
    }

    public List<LabTest> getAllLabTests() {
        return labTestRepository.findAll();
    }
}

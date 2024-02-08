package com.pharmatest.pharma.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pharmatest.pharma.model.LabTest;
import com.pharmatest.pharma.service.LabTestService;

@RestController
@RequestMapping("/api")
public class LabTestController {

    private final LabTestService labTestService;

    public LabTestController(LabTestService labTestService) {
        this.labTestService = labTestService;
    }

    @GetMapping("/labtests")
    public List<LabTest> getAllLabTests() {
        return labTestService.getAllLabTests();
    }
}

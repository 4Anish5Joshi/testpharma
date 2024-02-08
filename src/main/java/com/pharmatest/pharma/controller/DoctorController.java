package com.pharmatest.pharma.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmatest.pharma.model.Doctor;
import com.pharmatest.pharma.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    // API endpoint to get all doctors (returns JSON/XML data)
    @GetMapping
    public List<Doctor> getAllDoctorsAPI() {
        return doctorService.getAllDoctors();
    }

    // HTML endpoint to render the doctor.html template
    @GetMapping("/doctors")
    public String getAllDoctors(Model model) {
        List<Doctor> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        return "doctor"; // Renders the drecord.html template
    }

//     @GetMapping("/view/{id}")
//     public String viewPatientDetails(@PathVariable Long id, Model model) {
//     // Retrieve patient details by ID
//     Optional<Patient> patient = patientService.getImageById(id);

//     if (patient.isPresent()) {
//         model.addAttribute("patient", patient.get()); // Add patient details to the model
//         return "dviewdetails"; // Return the template to display patient details
//     } else {
//         return "redirect:/"; // Redirect to home page or handle error as needed
//     }
// }

    
}


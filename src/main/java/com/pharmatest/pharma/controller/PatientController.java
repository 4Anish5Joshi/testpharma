package com.pharmatest.pharma.controller;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmatest.pharma.model.Patient;
import com.pharmatest.pharma.repositories.PatientRepository;
import com.pharmatest.pharma.service.PatientService;


@Controller
public class PatientController {

	@Autowired
    PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @GetMapping("/booknow")

    public String getRegPage(@ModelAttribute("patient") Patient patient) {
        return "labt"; 
    }

    @PostMapping("/booknow")
    public String savePatient(@ModelAttribute("patient") Patient patient, Model model) {
            patientRepository.save(patient);
            model.addAttribute("message", "Lab test booked successfully");
    
    return "labt"; // Return to the booking form
    }
   
   @GetMapping("/doctors")
     public String doctorsPage(Model model){
    List<Patient> listOfPatients = patientRepository.findAll();
    model.addAttribute("patient", listOfPatients);
    return "drecord"; 
}
    
   
    @PostMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id, Model model) {
        patientService.deletePatientById(id); // This line calls the method correctly
        model.addAttribute("message", "Patient deleted successfully");
        return "redirect:/patient"; // Redirect to the patient list page
    }

    @GetMapping("/view/{id}")
    public String viewPatientDetails(@PathVariable Long id, Model model) {
    // Retrieve patient details by ID
    Optional<Patient> patient = patientService.getImageById(id);

    if (patient.isPresent()) {
        model.addAttribute("patient", patient.get()); // Add patient details to the model
        return "viewdetails"; // Return the template to display patient details
    } else {
        return "redirect:/"; // Redirect to home page or handle error as needed
    }
}

@GetMapping("/patient")
    public String patientsPage(Model model){
        List<Patient> listOfPatient = patientRepository.findAll();

        listOfPatient.forEach(patient -> {
            String imageData = patient.getImgBase64();
            if (imageData != null) {
                String base64EncodedImage = Base64.getEncoder().encodeToString(imageData.getBytes());
                patient.setImgBase64(base64EncodedImage);
            }
        });

        model.addAttribute("patient", listOfPatient);
        return "record";
    }


}






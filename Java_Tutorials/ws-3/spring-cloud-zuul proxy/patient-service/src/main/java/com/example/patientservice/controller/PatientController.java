package com.example.patientservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/patientInfo")
    public String getPatientInfo()
    {
        return "Hiiii this is Suneel. I'm from patient service....";
    }
}

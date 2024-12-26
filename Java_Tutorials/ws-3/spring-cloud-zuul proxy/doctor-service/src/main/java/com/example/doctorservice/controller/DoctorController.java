package com.example.doctorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctorInfo")
    public String getDoctorInfo()
    {
        return "Hey This is John MBBS";
    }
}

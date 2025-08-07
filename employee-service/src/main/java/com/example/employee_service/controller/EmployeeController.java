package com.example.employee_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/test")
    public String getTest() {
        return "✅ Employee Service is working!";
    }
}

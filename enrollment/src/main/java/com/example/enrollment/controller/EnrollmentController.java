package com.example.enrollment.controller;

import com.example.enrollment.dto.EnrollmentForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EnrollmentController {

    @GetMapping("/enroll")
    public String showForm(EnrollmentForm enrollmentForm, Model model) {
        // Add options for dropdowns/radio buttons
        model.addAttribute("genders", Arrays.asList("Male", "Female"));
        model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
        model.addAttribute("countries", Arrays.asList("USA", "CANADA", "UK", "AUSTRALIA"));
        model.addAttribute("subjectList", Arrays.asList(
            "Physics", "Chemistry", "Life Science", "Political Science"
        ));
        return "enrollment-form";
    }

    @PostMapping("/enroll")
    public String submitForm(@Valid EnrollmentForm enrollmentForm, 
                           BindingResult bindingResult, 
                           Model model) {
        
        if (bindingResult.hasErrors()) {
            // Re-add options if there are errors
            model.addAttribute("genders", Arrays.asList("Male", "Female"));
            model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
            model.addAttribute("countries", Arrays.asList("USA", "CANADA", "UK", "AUSTRALIA"));
            model.addAttribute("subjectList", Arrays.asList(
                "Physics", "Chemistry", "Life Science", "Political Science"
            ));
            return "enrollment-form";
        }
        
        // Process the enrollment
        System.out.println("Enrollment details:");
        System.out.println("Name: " + enrollmentForm.getFirstName() + " " + enrollmentForm.getLastName());
        System.out.println("DOB: " + enrollmentForm.getDob());
        System.out.println("Email: " + enrollmentForm.getEmail());
        
        return "enrollment-success";
    }
}
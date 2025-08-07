package com.example.formdemo.controller;

import com.example.formdemo.model.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @GetMapping("/customer")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerform";
    }

    @PostMapping("/customer")
    public String saveCustomer(
        @Valid @ModelAttribute("customer") Customer customer,
        BindingResult bindingResult,
        Model model
    ) {
        if (bindingResult.hasErrors()) {
            return "customerform";
        }
        model.addAttribute("message", "Customer saved successfully!");
        return "success";
    }
}

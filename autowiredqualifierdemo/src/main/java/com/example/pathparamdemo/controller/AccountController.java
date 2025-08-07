package com.example.pathparamdemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AccountController {

    @GetMapping("/users/{id}/accounts")
    public List<String> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        // Log input just to simulate
        List<String> response = new ArrayList<>();
        response.add("User ID: " + id);
        response.add("Account Type: " + type);
        response.add("Account Status: " + status);
        return response;
    }
}

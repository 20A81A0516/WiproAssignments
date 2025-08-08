package com.example.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public String placeOrder() {
        String response = restTemplate.getForObject("http://localhost:8082/payment", String.class);
        return "Order Placed | " + response;
    }
}
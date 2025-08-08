package com.example.payment_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @GetMapping("/payment")
    public String makePayment() {
        return "Payment Successful";
    }
}

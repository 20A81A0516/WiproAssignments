package com.example.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockApplication.class, args);
    }

    @GetMapping("/delivery/status")
    public String getStatus() {
        return "Delivery on the way!";
    }
}




//http://localhost:8081/delivery/status
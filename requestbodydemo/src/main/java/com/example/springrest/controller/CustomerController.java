package com.example.springrest.controller;

import com.example.springrest.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/springrest")
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435", 1467240235069L),
                new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345", 1467240235069L),
                new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987", 1467240235069L)
        );
    }
}

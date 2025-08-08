package com.example.requestbodydemo.controller;
import com.example.requestbodydemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}

package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/test")
    public String redirectToTest2() {
        return "redirect:/test2";
    }

    @GetMapping("/test2")
    public String handleTest2() {
        return "test2";
    }
}

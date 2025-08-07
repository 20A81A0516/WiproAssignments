package com.example.autowiredqualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ClassXLM {

    @Autowired
    @Qualifier("classABC")  // Change to classDEF or classXYZ to test
    private InterfacePQR pqr;

    @PostConstruct
    public void init() {
        pqr.display();
    }
}

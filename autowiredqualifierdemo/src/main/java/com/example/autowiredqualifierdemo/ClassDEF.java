package com.example.autowiredqualifierdemo;

import org.springframework.stereotype.Component;

@Component("classDEF")
public class ClassDEF implements InterfacePQR {
    public void display() {
        System.out.println("Hi, I am classDEF");
    }
}

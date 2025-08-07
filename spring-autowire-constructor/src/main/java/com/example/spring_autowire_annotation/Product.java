package com.example.spring_autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;
    private String name;
    private double price;

    @Autowired
    private Category category;

    public Product() {
        this.id = 101;
        this.name = "Smartphone";
        this.price = 15000.0;
    }

    public void display() {
        System.out.println("---- Product Details ----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Category: " + category.getCategoryName() + " (ID: " + category.getCategoryId() + ")");
    }
}

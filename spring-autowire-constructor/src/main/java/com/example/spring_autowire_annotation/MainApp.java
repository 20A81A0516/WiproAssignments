package com.example.spring_autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Product product = context.getBean(Product.class);
        product.display();
    }
}


/*
---- Product Details ----
ID: 101
Name: Smartphone
Price: ₹15000.0
Category: Electronics (ID: 1)*/
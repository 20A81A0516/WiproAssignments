package com.example.spring_autowire_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Purchase purchase = (Purchase) context.getBean("purchase");
        purchase.display();
    }
}



/*
Product(int) constructor called
Purchase(Product) constructor called
Purchase Details:
Product Price: 250
*/
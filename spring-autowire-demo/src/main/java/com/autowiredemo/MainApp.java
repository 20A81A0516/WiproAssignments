package com.autowiredemo;

import com.autowiredemo.config.AppConfig;
import com.autowiredemo.model.Freshman;
import com.autowiredemo.runner.AutowireRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:\n1. Autowired\n2. Autowired with Qualifier");
        System.out.print("Select option: ");
        int option = scanner.nextInt();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Freshman freshman = context.getBean(Freshman.class);

        if (option == 2) {
            System.out.println("Using Qualifier: roomB");
            context.getBeanFactory().autowireBeanProperties(freshman,
                    org.springframework.beans.factory.config.AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
        }

        AutowireRunner.displayInfo(freshman);
        context.close();
    }
}

/*
Options:
1. Autowired
2. Autowired with Qualifier
Select option: 2
Using Qualifier: roomB
Student Name: John Doe
Dorm Location: Room 101, North Hall

*/
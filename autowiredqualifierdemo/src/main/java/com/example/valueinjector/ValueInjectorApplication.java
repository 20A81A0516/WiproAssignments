package com.example.valueinjector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueInjectorApplication implements CommandLineRunner {

    @Autowired
    private valueReader reader;

    public static void main(String[] args) {
        SpringApplication.run(ValueInjectorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        reader.printValues();
    }
}

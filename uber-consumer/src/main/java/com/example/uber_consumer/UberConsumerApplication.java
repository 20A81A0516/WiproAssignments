package com.example.uber_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class UberConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UberConsumerApplication.class, args);
    }
}

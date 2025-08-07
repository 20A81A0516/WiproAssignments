package com.example.spring_autowire_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.spring_autowire_annotation")
public class AppConfig {
}

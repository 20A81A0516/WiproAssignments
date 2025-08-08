package com.autowiredemo.config;

import com.autowiredemo.model.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autowiredemo")
public class AppConfig {

    @Bean(name = "roomA")
    public DormRoom roomA() {
        return new DormRoom(101, "North Hall");
    }

    @Bean(name = "roomB")
    public DormRoom roomB() {
        return new DormRoom(202, "East Hall");
    }

    @Bean
    public Freshman freshman() {
        return new Freshman("John Doe");
    }
}

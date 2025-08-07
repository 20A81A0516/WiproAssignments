package com.example.pathparamdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PathParamDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PathParamDemoApplication.class, args);
    }
}



//http://localhost:8080/users/101/accounts?type=current&status=active

//http://localhost:8080/swagger-ui/index.html
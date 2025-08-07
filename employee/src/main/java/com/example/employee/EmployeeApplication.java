package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}


//http://localhost:8080/SpringBootRestApi/api/user
//GET http://localhost:8080/SpringBootRestApi/api/user/1
//POST http://localhost:8080/SpringBootRestApi/api/user
//PUT http://localhost:8080/SpringBootRestApi/api/user/2
//DELETE http://localhost:8080/SpringBootRestApi/api/user/2
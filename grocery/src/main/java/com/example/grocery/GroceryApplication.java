package com.example.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryApplication.class, args);
	}

}



//POST http://localhost:8080/api/grocery
//GET http://localhost:8080/api/grocery
//GET http://localhost:8080/api/grocery/1
//PUT http://localhost:8080/api/grocery/1
//DELETE http://localhost:8080/api/grocery/1

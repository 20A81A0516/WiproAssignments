package com.example.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

}




//GET http://localhost:8080/api/books/982
//GET http://localhost:8080/api/books
//DELETE http://localhost:8080/api/books/9999
package com.example.restaurant_food_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantFoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantFoodApiApplication.class, args);
	}

}


/*
POST http://localhost:8080/api/restaurants
GET http://localhost:8080/api/restaurants
GET http://localhost:8080/api/restaurants/1
DELETE http://localhost:8080/api/restaurants/1
POST http://localhost:8080/api/restaurants/1/foods
DELETE http://localhost:8080/api/restaurants/foods/5
*/

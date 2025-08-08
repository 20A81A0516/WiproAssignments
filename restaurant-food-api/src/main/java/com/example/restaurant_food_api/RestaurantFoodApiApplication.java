package com.example.restaurant_food_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantFoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantFoodApiApplication.class, args);
	}

}


/*GET all → http://localhost:8080/api/grocery

POST (with JSON body) → http://localhost:8080/api/grocery

GET by id → http://localhost:8080/api/grocery/1

PUT by id → http://localhost:8080/api/grocery/1

DELETE by id → http://localhost:8080/api/grocery/1
*/
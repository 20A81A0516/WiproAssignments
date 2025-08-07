package com.microservices.restaurant_producer.controller;

import com.microservices.restaurant_producer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return Arrays.asList(
            new Restaurant(1, "Tasty Bites", "New York"),
            new Restaurant(2, "Spicy Heaven", "Chicago"),
            new Restaurant(3, "Burger Palace", "Los Angeles")
        );
    }
}
package com.example.restaurant_food_api.controller;

import com.example.restaurant_food_api.entity.Food;
import com.example.restaurant_food_api.entity.Restaurant;
import com.example.restaurant_food_api.service.FoodService;
import com.example.restaurant_food_api.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final FoodService foodService;

    public RestaurantController(RestaurantService restaurantService, FoodService foodService) {
        this.restaurantService = restaurantService;
        this.foodService = foodService;
    }

    // Create restaurant
    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@Valid @RequestBody Restaurant restaurant) {
        Restaurant saved = restaurantService.create(restaurant);
        return ResponseEntity.created(URI.create("/api/restaurants/" + saved.getId())).body(saved);
    }

    // Get all
    @GetMapping
    public List<Restaurant> getAll() {
        return restaurantService.getAll();
    }

    // Get by id
    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable Long id) {
        return restaurantService.getById(id);
    }

    // Delete restaurant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Add food to restaurant
    @PostMapping("/{id}/foods")
    public ResponseEntity<Food> addFood(@PathVariable Long id, @Valid @RequestBody Food food) {
        Food saved = foodService.addFoodToRestaurant(id, food);
        return ResponseEntity.created(URI.create("/api/restaurants/foods/" + saved.getId())).body(saved);
    }

    // Delete food by id
    @DeleteMapping("/foods/{foodId}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long foodId) {
        foodService.deleteFood(foodId);
        return ResponseEntity.noContent().build();
    }
}

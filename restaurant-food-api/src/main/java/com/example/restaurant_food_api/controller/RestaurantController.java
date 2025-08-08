package com.example.restaurant_food_api.controller;

import com.example.restaurant_food_api.entity.Food;
import com.example.restaurant_food_api.entity.Restaurant;
import com.example.restaurant_food_api.exception.ResourceNotFoundException;
import com.example.restaurant_food_api.repository.FoodRepository;
import com.example.restaurant_food_api.repository.RestaurantRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grocery")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private FoodRepository foodRepo;

    @PostMapping
    public Restaurant createRestaurant(@Valid @RequestBody Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        if (!restaurantRepo.existsById(id)) {
            throw new ResourceNotFoundException("Restaurant not found with id: " + id);
        }
        restaurantRepo.deleteById(id);
    }

    @PostMapping("/{id}/foods")
    public Food addFoodToRestaurant(@PathVariable Long id, @Valid @RequestBody Food food) {
        Restaurant restaurant = restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
        food.setRestaurant(restaurant);
        return foodRepo.save(food);
    }

    @DeleteMapping("/foods/{foodId}")
    public void deleteFood(@PathVariable Long foodId) {
        if (!foodRepo.existsById(foodId)) {
            throw new ResourceNotFoundException("Food not found with id: " + foodId);
        }
        foodRepo.deleteById(foodId);
    }
}

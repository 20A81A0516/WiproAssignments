package com.example.restaurant_food_api.service;

import com.example.restaurant_food_api.entity.Food;

public interface FoodService {
    Food addFoodToRestaurant(Long restaurantId, Food food);
    void deleteFood(Long foodId);
}

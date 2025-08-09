package com.example.restaurant_food_api.service;

import com.example.restaurant_food_api.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant create(Restaurant restaurant);
    List<Restaurant> getAll();
    Restaurant getById(Long id);
    void deleteById(Long id);
}

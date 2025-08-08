package com.example.restaurant_food_api.repository;

import com.example.restaurant_food_api.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}

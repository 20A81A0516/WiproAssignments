package com.example.restaurant_food_api.repository;

import com.example.restaurant_food_api.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

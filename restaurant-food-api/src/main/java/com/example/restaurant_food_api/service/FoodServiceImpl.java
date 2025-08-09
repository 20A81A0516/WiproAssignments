package com.example.restaurant_food_api.service;

import com.example.restaurant_food_api.entity.Food;
import com.example.restaurant_food_api.entity.Restaurant;
import com.example.restaurant_food_api.exception.ResourceNotFoundException;
import com.example.restaurant_food_api.repository.FoodRepository;
import com.example.restaurant_food_api.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepo;
    private final RestaurantRepository restaurantRepo;

    public FoodServiceImpl(FoodRepository foodRepo, RestaurantRepository restaurantRepo) {
        this.foodRepo = foodRepo;
        this.restaurantRepo = restaurantRepo;
    }

    @Override
    @Transactional
    public Food addFoodToRestaurant(Long restaurantId, Food food) {
        Restaurant restaurant = restaurantRepo.findById(restaurantId)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + restaurantId));
        food.setRestaurant(restaurant);
        Food saved = foodRepo.save(food);
        return saved;
    }

    @Override
    public void deleteFood(Long foodId) {
        if (!foodRepo.existsById(foodId)) {
            throw new ResourceNotFoundException("Food not found with id: " + foodId);
        }
        foodRepo.deleteById(foodId);
    }
}

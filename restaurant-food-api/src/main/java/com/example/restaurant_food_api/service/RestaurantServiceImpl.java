package com.example.restaurant_food_api.service;

import com.example.restaurant_food_api.entity.Restaurant;
import com.example.restaurant_food_api.exception.ResourceNotFoundException;
import com.example.restaurant_food_api.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repo;

    public RestaurantServiceImpl(RestaurantRepository repo) {
        this.repo = repo;
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return repo.save(restaurant);
    }

    @Override
    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    @Override
    public Restaurant getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Restaurant not found with id: " + id);
        }
        repo.deleteById(id);
    }
}

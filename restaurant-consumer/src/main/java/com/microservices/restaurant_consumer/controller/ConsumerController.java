package com.microservices.restaurant_consumer.controller;


import com.microservices.restaurant_consumer.feign.RestaurantFeignClient;
import com.microservices.restaurant_consumer.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestaurantFeignClient restaurantFeignClient;

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        return restaurantFeignClient.getAllRestaurants();
    }
}
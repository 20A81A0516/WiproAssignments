package com.example.restaurant_food_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Location is mandatory")
    private String location;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Food> foodItems = new ArrayList<>();

    public Restaurant() {}

    public Restaurant(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<Food> getFoodItems() { return foodItems; }
    public void setFoodItems(List<Food> foodItems) { this.foodItems = foodItems; }

    // helper methods
    public void addFood(Food food) {
        foodItems.add(food);
        food.setRestaurant(this);
    }

    public void removeFood(Food food) {
        foodItems.remove(food);
        food.setRestaurant(null);
    }
}

package com.example.grocery_store.controller;

import com.example.grocery_store.model.GroceryItem;
import com.example.grocery_store.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to our Grocery Store! This is a public message.";
    }

    @GetMapping("/items")
    public List<GroceryItem> getItems() {
        return Arrays.asList(
            new GroceryItem(1L, "Apple", 0.99),
            new GroceryItem(2L, "Banana", 0.59),
            new GroceryItem(3L, "Milk", 2.49)
        );
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return Arrays.asList(
            new Order(1L, "John Doe", "Apple, Banana, Milk", 4.07),
            new Order(2L, "Jane Smith", "Bread, Eggs", 3.50)
        );
    }
    
    // Add this for role-based access demonstration
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "This is an ADMIN only endpoint";
    }
}
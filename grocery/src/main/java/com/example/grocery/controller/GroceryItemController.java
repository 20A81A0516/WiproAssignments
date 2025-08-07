package com.example.grocery.controller;

import com.example.grocery.entity.GroceryItem;
import com.example.grocery.service.GroceryItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grocery")
public class GroceryItemController {

    @Autowired
    private GroceryItemService service;

    @PostMapping
    public GroceryItem create(@Valid @RequestBody GroceryItem item) {
        return service.save(item);
    }

    @GetMapping
    public List<GroceryItem> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GroceryItem getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public GroceryItem update(@PathVariable Long id, @Valid @RequestBody GroceryItem item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
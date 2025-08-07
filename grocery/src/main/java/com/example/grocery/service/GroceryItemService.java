package com.example.grocery.service;

import com.example.grocery.entity.GroceryItem;
import java.util.List;

public interface GroceryItemService {
    GroceryItem save(GroceryItem item);
    List<GroceryItem> getAll();
    GroceryItem getById(Long id);
    GroceryItem update(Long id, GroceryItem item);
    void delete(Long id);
}
package com.example.grocery;

import com.example.grocery.entity.GroceryItem;
import com.example.grocery.repository.GroceryItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GroceryItemIntegrationTest {

 @Autowired
 private GroceryItemRepository repository;

 @Test
 void testSaveAndFetch() {
     GroceryItem item = new GroceryItem();
     item.setName("Wheat");
     item.setQuantity(3);
     item.setPrice(80);

     GroceryItem saved = repository.save(item);

     GroceryItem fetched = repository.findById(saved.getId()).orElseThrow();
     assertEquals("Wheat", fetched.getName());
 }
}

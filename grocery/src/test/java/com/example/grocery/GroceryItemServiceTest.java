package com.example.grocery;

import com.example.grocery.entity.GroceryItem;
import com.example.grocery.repository.GroceryItemRepository;
import com.example.grocery.service.GroceryItemServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GroceryItemServiceTest {

 @Mock
 private GroceryItemRepository repository;

 @InjectMocks
 private GroceryItemServiceImpl service;

 public GroceryItemServiceTest() {
     MockitoAnnotations.openMocks(this);
 }

 @Test
 void testSave() {
     GroceryItem item = new GroceryItem();
     item.setName("Rice");
     item.setQuantity(2);
     item.setPrice(45);

     when(repository.save(item)).thenReturn(item);

     GroceryItem saved = service.save(item);
     assertEquals("Rice", saved.getName());
 }

 @Test
 void testGetById() {
     GroceryItem item = new GroceryItem();
     item.setId(1L);
     item.setName("Sugar");
     item.setQuantity(1);
     item.setPrice(30);

     when(repository.findById(1L)).thenReturn(Optional.of(item));
     GroceryItem fetched = service.getById(1L);
     assertEquals("Sugar", fetched.getName());
 }
}

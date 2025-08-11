package com.example.uber_consumer.controller;

import com.example.uber_consumer.entity.Ride;
import com.example.uber_consumer.repository.RideRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final RideRepository repo;
    public RideController(RideRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Ride> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Ride> getById(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

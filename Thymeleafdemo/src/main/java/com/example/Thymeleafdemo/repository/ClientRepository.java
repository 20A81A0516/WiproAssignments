package com.example.Thymeleafdemo.repository;


import com.example.Thymeleafdemo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

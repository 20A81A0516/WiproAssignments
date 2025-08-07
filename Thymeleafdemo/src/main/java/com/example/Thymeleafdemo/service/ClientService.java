package com.example.Thymeleafdemo.service;

import com.example.Thymeleafdemo.entity.Client;
import com.example.Thymeleafdemo.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repo;

    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    public List<Client> listAll() {
        return repo.findAll();
    }

    public void save(Client client) {
        repo.save(client);
    }

    public Client get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

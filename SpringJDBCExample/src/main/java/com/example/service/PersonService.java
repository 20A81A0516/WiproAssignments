package com.example.service;

import java.util.List;

import com.example.dao.PersonDAO;
import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonDAO dao;

    public void performOperations() {
        System.out.println("List of person is:");
        dao.getAllPersons().forEach(System.out::println);

        System.out.println("\nGet person with ID 2");
        System.out.println(dao.getPersonById(2));

        System.out.println("\nCreating person:");
        Person p = new Person();
        p.setAge(36);
        p.setFirstName("Sergey");
        p.setLastName("Emets");
        dao.insertPerson(p);

        System.out.println("\nList of person is:");
        dao.getAllPersons().forEach(System.out::println);

        System.out.println("\nDeleting person with ID 2");
        dao.deletePerson(2);

        System.out.println("\nUpdate person with ID 4");
        Person updated = dao.getPersonById(4);
        updated.setLastName("CHANGED");
        dao.updatePerson(updated);

        System.out.println("\nList of person is:");
        dao.getAllPersons().forEach(System.out::println);
    }
}

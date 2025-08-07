package com.javadeveloper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadeveloper.model.Book;
import com.javadeveloper.model.Books;

@RestController
public class BookController {

    @GetMapping(value = "/bookXYZ", produces = "application/xml")
    public Books getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "JTA Tutorials", "Krishna"));
        bookList.add(new Book(102, "Spring Tutorial", "Mahesh"));
        bookList.add(new Book(103, "Angular Tutorial", "Shiva"));
        return new Books(bookList);
    }
}

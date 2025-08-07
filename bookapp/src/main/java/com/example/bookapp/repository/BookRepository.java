package com.example.bookapp.repository;

import com.example.bookapp.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Book> findAll() {
        return jdbcTemplate.query(
            "SELECT * FROM books", 
            new BeanPropertyRowMapper<>(Book.class)
        );
    }
    
    public Book findById(int id) {
        return jdbcTemplate.queryForObject(
            "SELECT * FROM books WHERE bookid = ?", 
            new BeanPropertyRowMapper<>(Book.class), 
            id
        );
    }
    
    public int save(Book book) {
        return jdbcTemplate.update(
            "INSERT INTO books (bookid, bookname, author, price) VALUES (?, ?, ?, ?)",
            book.getBookId(), book.getBookName(), book.getAuthor(), book.getPrice()
        );
    }
    
    public int update(Book book) {
        return jdbcTemplate.update(
            "UPDATE books SET bookname = ?, author = ?, price = ? WHERE bookid = ?",
            book.getBookName(), book.getAuthor(), book.getPrice(), book.getBookId()
        );
    }
    
    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM books WHERE bookid = ?", id);
    }
}
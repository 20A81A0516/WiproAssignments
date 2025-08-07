package com.example.dao;

import com.example.model.Author;
import com.example.model.Book;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookAuthorDAO {
    public void addBookWithAuthors(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(book); // Cascade saves authors

        tx.commit();
        session.close();
    }

    public void viewBooks() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.createQuery("FROM Book", Book.class)
                .getResultList()
                .forEach(book -> {
                    System.out.println("Book: " + book.getTitle());
                    book.getAuthors().forEach(a -> System.out.println("   Author: " + a.getName()));
                });
        session.close();
    }
}

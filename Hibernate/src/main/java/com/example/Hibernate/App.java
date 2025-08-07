package com.example.Hibernate;

import com.example.dao.BookAuthorDAO;
import com.example.model.Author;
import com.example.model.Book;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookAuthorDAO dao = new BookAuthorDAO();

        System.out.println("1. Add Book with Authors");
        System.out.println("2. View All Books");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();
                Book book = new Book(title);

                System.out.print("How many authors? ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter Author Name: ");
                    String name = sc.nextLine();
                    Author author = new Author(name);
                    book.addAuthor(author);
                }

                dao.addBookWithAuthors(book);
                System.out.println("Book and authors saved!");
                break;

            case 2:
                dao.viewBooks();
                break;
        }
        sc.close();
    }
}

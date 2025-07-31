package practice;
import java.util.*;

class BookStore {
    int bookId;
    String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public String toString() {
        return "BookID: " + bookId + ", BookName: " + bookName;
    }
}

class BookNameComparator implements Comparator<BookStore> {
    public int compare(BookStore b1, BookStore b2) {
        return b1.bookName.compareToIgnoreCase(b2.bookName);
    }
}

class BookIdComparator implements Comparator<BookStore> {
    public int compare(BookStore b1, BookStore b2) {
        return Integer.compare(b1.bookId, b2.bookId);
    }
}

public class BookSortTest {
    public static void main(String[] args) {
        List<BookStore> list = new ArrayList<>();
        list.add(new BookStore(103, "Java"));
        list.add(new BookStore(101, "Python"));
        list.add(new BookStore(102, "C++"));

        System.out.println("Sorted by Book Name:");
        Collections.sort(list, new BookNameComparator());
        for (BookStore b : list) {
            System.out.println(b);
        }

        System.out.println("\nSorted by Book ID:");
        Collections.sort(list, new BookIdComparator());
        for (BookStore b : list) {
            System.out.println(b);
        }
    }
}


/*
Sorted by Book Name:
BookID: 102, BookName: C++
BookID: 103, BookName: Java
BookID: 101, BookName: Python

Sorted by Book ID:
BookID: 101, BookName: Python
BookID: 102, BookName: C++
BookID: 103, BookName: Java
*/

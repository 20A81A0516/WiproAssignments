package practice;

import java.util.ArrayList;

class MediaLibraryNonGeneric {
    private ArrayList mediaList = new ArrayList();

    public void add(Object item) {
        mediaList.add(item);
    }

    public void retrieve() {
        for (Object obj : mediaList) {
            System.out.println(obj);
        }
    }
}

class Book {
    public String toString() {
        return "Book: Java Programming";
    }
}

class Video {
    public String toString() {
        return "Video: Java Tutorial.mp4";
    }
}

class Newspaper {
    public String toString() {
        return "Newspaper: The Times of India";
    }
}

public class NonGenericTest {
    public static void main(String[] args) {
        MediaLibraryNonGeneric lib = new MediaLibraryNonGeneric();
        lib.add(new Book());
        lib.add(new Video());
        lib.add(new Newspaper());

        System.out.println("Non-Generic Media Library:");
        lib.retrieve();
    }
}


/*
Non-Generic Media Library:
Book: Java Programming
Video: Java Tutorial.mp4
Newspaper: The Times of India
*/

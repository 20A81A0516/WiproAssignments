package practice;

import java.util.ArrayList;
class MediaLibraryGeneric<T> {
 private ArrayList<T> mediaList = new ArrayList<>();

 public void add(T item) {
     mediaList.add(item);
 }

 public void retrieve() {
     for (T item : mediaList) {
         System.out.println(item);
     }
 }
}

public class GenericTest {
 public static void main(String[] args) {
     MediaLibraryGeneric<Book> bookLib = new MediaLibraryGeneric<>();
     bookLib.add(new Book());

     MediaLibraryGeneric<Video> videoLib = new MediaLibraryGeneric<>();
     videoLib.add(new Video());

     MediaLibraryGeneric<Newspaper> newsLib = new MediaLibraryGeneric<>();
     newsLib.add(new Newspaper());

     System.out.println("Generic Media Library (Books):");
     bookLib.retrieve();

     System.out.println("Generic Media Library (Videos):");
     videoLib.retrieve();

     System.out.println("Generic Media Library (Newspapers):");
     newsLib.retrieve();
 }
}



/*
Generic Media Library (Books):
Book: Java Programming
Generic Media Library (Videos):
Video: Java Tutorial.mp4
Generic Media Library (Newspapers):
Newspaper: The Times of India
*/
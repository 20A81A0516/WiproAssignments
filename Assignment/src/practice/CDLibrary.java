package practice;

import java.util.*;
class CD implements Comparable<CD> {
 String title;
 String singer;

 public CD(String title, String singer) {
     this.title = title;
     this.singer = singer;
 }

 public int compareTo(CD other) {
     return this.singer.compareTo(other.singer);
 }

 public String toString() {
     return "Title: " + title + ", Singer: " + singer;
 }
}

public class CDLibrary {
 public static void main(String[] args) {
     ArrayList<CD> cds = new ArrayList<>();
     cds.add(new CD("Love Songs", "Arijit Singh"));
     cds.add(new CD("Rock Hits", "Sonu Nigam"));
     cds.add(new CD("Melodies", "Lata Mangeshkar"));
     cds.add(new CD("Classics", "Kumar Sanu"));

     Collections.sort(cds);

     System.out.println("CDs sorted by Singer:");
     for (CD cd : cds) {
         System.out.println(cd);
     }
 }
}


/*
CDs sorted by Singer:
Title: Love Songs, Singer: Arijit Singh
Title: Classics, Singer: Kumar Sanu
Title: Melodies, Singer: Lata Mangeshkar
Title: Rock Hits, Singer: Sonu Nigam
*/
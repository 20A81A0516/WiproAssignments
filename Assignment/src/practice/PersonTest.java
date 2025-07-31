package practice;
abstract class Person {

 abstract void eat();

 abstract void exercise();
}


class Athlete extends Person {
 void eat() {
     System.out.println("Athlete eats a high-protein, balanced diet.");
 }

 void exercise() {
     System.out.println("Athlete exercises rigorously every day.");
 }
}


class LazyPerson extends Person {
 void eat() {
     System.out.println("Lazy person eats fast food and skips meals often.");
 }

 void exercise() {
     System.out.println("Lazy person avoids exercise and prefers sleeping.");
 }
}


public class PersonTest {
 public static void main(String[] args) {
     Person p1 = new Athlete(); 
     Person p2 = new LazyPerson(); 

     System.out.println("--- Athlete Behavior ---");
     p1.eat();
     p1.exercise();

     System.out.println("\n--- Lazy Person Behavior ---");
     p2.eat();
     p2.exercise();
 }
}



/*
--- Athlete Behavior ---
Athlete eats a high-protein, balanced diet.
Athlete exercises rigorously every day.

--- Lazy Person Behavior ---
Lazy person eats fast food and skips meals often.
Lazy person avoids exercise and prefers sleeping.
*/
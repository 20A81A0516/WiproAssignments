package demos;

interface Drawable {
 void drawingColor();
 void thickness();
}

interface Fillable {
 void fillingColor();
 void size();
}

class Line implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Line Drawing Color: Black");
 }

 public void thickness() {
     System.out.println("Line Thickness: 2px");
 }

 public void fillingColor() {
     System.out.println("Line Filling Color: Not Applicable");
 }

 public void size() {
     System.out.println("Line Size: 10 units");
 }
}

class Circle implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Circle Drawing Color: Blue");
 }

 public void thickness() {
     System.out.println("Circle Thickness: 3px");
 }

 public void fillingColor() {
     System.out.println("Circle Filling Color: Light Blue");
 }

 public void size() {
     System.out.println("Circle Radius: 5 units");
 }
}

class Square implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Square Drawing Color: Red");
 }

 public void thickness() {
     System.out.println("Square Thickness: 4px");
 }

 public void fillingColor() {
     System.out.println("Square Filling Color: Pink");
 }

 public void size() {
     System.out.println("Square Side Length: 6 units");
 }
}

public class InterfaceDemo {
 public static void main(String[] args) {
     // Line
     System.out.println("---- Line ----");
     Line line = new Line();
     line.drawingColor();
     line.thickness();
     line.fillingColor();
     line.size();

     System.out.println("\n---- Circle ----");
     Circle circle = new Circle();
     circle.drawingColor();
     circle.thickness();
     circle.fillingColor();
     circle.size();

     System.out.println("\n---- Square ----");
     Square square = new Square();
     square.drawingColor();
     square.thickness();
     square.fillingColor();
     square.size();
 }
}



/*
 * ---- Line ----
Line Drawing Color: Black
Line Thickness: 2px
Line Filling Color: Not Applicable
Line Size: 10 units

---- Circle ----
Circle Drawing Color: Blue
Circle Thickness: 3px
Circle Filling Color: Light Blue
Circle Radius: 5 units

---- Square ----
Square Drawing Color: Red
Square Thickness: 4px
Square Filling Color: Pink
Square Side Length: 6 units
*/

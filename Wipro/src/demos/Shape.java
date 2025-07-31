package demos;
class Shape {

    public double area(double side) {
        return side * side;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double perimeter(double side) {
        return 4 * side;
    }

    public double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Shape();

        double squareSide = 5.0;
        System.out.println("Square Area: " + s.area(squareSide));
        System.out.println("Square Perimeter: " + s.perimeter(squareSide));

        double length = 6.0, breadth = 4.0;
        System.out.println("Rectangle Area: " + s.area(length, breadth));
        System.out.println("Rectangle Perimeter: " + s.perimeter(length, breadth));
    }
}
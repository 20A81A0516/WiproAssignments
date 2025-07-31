package demos;
import java.util.Scanner;
public class MyTriangle {
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
   
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter three sides of the triangle (enter -1 for a to exit): ");
            double a = scanner.nextDouble();
            
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }
            
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            
            if (isValid(a, b, c)) {
                double triArea = area(a, b, c);
                double triPerimeter = perimeter(a, b, c);
                System.out.printf("Area: %.2f, Perimeter: %.2f%n", triArea, triPerimeter);
            } else {
                System.out.println("The input is invalid.");
            }
        }
        
        scanner.close();
    }
}
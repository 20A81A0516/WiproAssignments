package practice;
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
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("Enter side a (enter -1 to exit): ");
		            double a = sc.nextDouble();

		            if (a == -1) {
		                System.out.println("Bye~");
		                break;
		            }

		            System.out.print("Enter side b: ");
		            double b = sc.nextDouble();

		            System.out.print("Enter side c: ");
		            double c = sc.nextDouble();

		            if (isValid(a, b, c)) {
		                double area = area(a, b, c);
		                double perimeter = perimeter(a, b, c);
		                System.out.printf("Valid triangle.\nArea = %.2f\nPerimeter = %.2f\n\n", area, perimeter);
		            } else {
		                System.out.println("The input is invalid.\n");
		            }
		        }
		        sc.close();

	}

}


/*
Enter side a (enter -1 to exit): 1
Enter side b: 2
Enter side c: 3
The input is invalid.

Enter side a (enter -1 to exit): 3
Enter side b: 4
Enter side c: 5
Valid triangle.
Area = 6.00
Perimeter = 12.00

Enter side a (enter -1 to exit): -1
Bye~
*/
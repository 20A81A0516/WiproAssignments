package practice;

import java.util.Scanner;

@FunctionalInterface
interface MinThree {
    double find(double a, double b, double c);
}

public class MinimumFinder {

    public static void main(String[] args) {
        MinThree min = (a, b, c) -> Math.min(Math.min(a, b), c);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter third number: ");
        double z = sc.nextDouble();

        double result = min.find(x, y, z);
        System.out.println("Minimum of three is: " + result);
    }
}


/*
Enter first number: 5.7
Enter second number: 9.5
Enter third number: 8.0
Minimum of three is: 5.7
*/

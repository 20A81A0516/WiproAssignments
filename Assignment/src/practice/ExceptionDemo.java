package practice;

import java.util.*;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt(); 
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Not an integer.");
        }
        try {
            String str = "Java";
            System.out.println("Character at position 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index.");
        }
    }
}



/*
Enter an integer: 4
You entered: 4
Caught StringIndexOutOfBoundsException: Invalid index.
*/
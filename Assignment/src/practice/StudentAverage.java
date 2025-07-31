package practice;
import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];
        int count = 0;
        while (count < 3) {
            System.out.print("Enter the mark (0-100) for student " + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[count] = mark;
                    count++;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } else {
                System.out.println("Invalid input, try again...");
                scanner.next(); 
            }
        }

        double average = (marks[0] + marks[1] + marks[2]) / 3.0;

        System.out.printf("The average is: %.2f\n", average);

        scanner.close();
    }
}


/*
Enter the mark (0-100) for student 1: 80
Enter the mark (0-100) for student 2: 90
Enter the mark (0-100) for student 3: 50
The average is: 73.33
*/
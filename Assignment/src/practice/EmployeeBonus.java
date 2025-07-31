package practice;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		        Scanner sc = new Scanner(System.in); 

		        System.out.print("Enter your salary: ");
		        double salary = sc.nextDouble(); 

		        System.out.print("Enter your years of service: ");
		        int years = sc.nextInt(); 

		        if (years > 6) {
		            double bonus = salary * 0.10;
		            System.out.println("Your bonus is: " + bonus);
		        } else {
		            System.out.println("No bonus granted.");
		        }
	}

}

/*
Enter your salary: 25000
Enter your years of service: 3
No bonus granted.
*/
package practice;
import java.util.Scanner;
public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in); 

		        System.out.print("Enter your name: ");
		        String name = sc.nextLine(); 

		        System.out.print("Enter your roll number: ");
		        String roll = sc.nextLine(); 

		        System.out.print("Enter your field of interest: ");
		        String field = sc.nextLine();

		        System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest are " + field + ".");

	}

}


/*
Enter your name: rishi
Enter your roll number: 25
Enter your field of interest: football
Hey, my name is rishi and my roll number is 25. My field of interest are football.
*/
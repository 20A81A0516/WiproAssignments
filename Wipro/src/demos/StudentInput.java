package demos;
import java.util.Scanner;
public class StudentInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);

				System.out.println("Enter Roll Number: ");
				int rollNo = input.nextInt();
				input.nextLine(); 
				System.out.println("Enter Full Name: ");
				String fullName = input.nextLine();
				System.out.println("Enter Marks: ");
				float marks = input.nextFloat();
				System.out.println("Student Info: " + rollNo + " " + fullName + " " + marks);

				System.out.printf("Formatted: %d %s %.2f", rollNo, fullName, marks);

				System.out.printf("%nIs Pass: %b", marks >= 35);
	}

}

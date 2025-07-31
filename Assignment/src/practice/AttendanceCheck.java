package practice;
import java.util.Scanner;
public class AttendanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of classes held: ");
		        int totalClasses = sc.nextInt();

		        System.out.print("Enter number of classes attended: ");
		        int attendedClasses = sc.nextInt();

		        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;
		        System.out.println("Attendance Percentage: " + attendancePercentage + "%");

		        System.out.print("Do you have a medical cause? (Y/N): ");
		        char medicalCause = sc.next().charAt(0);

		        if (attendancePercentage >= 70 || medicalCause == 'Y' || medicalCause == 'y') {
		            System.out.println("You are allowed to sit in the exam.");
		        } else {
		            System.out.println("You are NOT allowed to sit in the exam.");
		        }

		        sc.close();
		
	}

}


/*
Enter number of classes held: 100
Enter number of classes attended: 80
Attendance Percentage: 80.0%
Do you have a medical cause? (Y/N): y
You are allowed to sit in the exam.
*/

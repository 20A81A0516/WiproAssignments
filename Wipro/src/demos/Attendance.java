package demos;
import java.util.Scanner;
public class Attendance {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of classes held: ");
		        int held = sc.nextInt();

		        System.out.print("Enter number of classes attended: ");
		        int attended = sc.nextInt();

		        double percentage = (attended * 100.0) / held; 

		        System.out.println("Attendance Percentage: " + percentage + "%"); 

		        if (percentage >= 70)
		            System.out.println("Allowed to sit in exam");
		        else
		            System.out.println("Not allowed to sit in exam");
		
	}

}


/*
Enter number of classes held: 100
Enter number of classes attended: 80
Attendance Percentage: 80.0%
Allowed to sit in exam
*/
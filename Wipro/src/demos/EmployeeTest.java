package demos;
import java.util.Scanner;

class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}

public class EmployeeTest {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Employee ID (format: yy-D-###): ");
         String empId = sc.nextLine();

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Year of Birth: ");
         int yob = sc.nextInt();

         if (!empId.matches("\\d{2}-[FS]-\\d{3}")) {
             throw new InvalidEmployeeCode("Invalid Employee Code Format!");
         }

         Employee emp = new Employee(empId, name, yob);
         System.out.println("\nEmployee Details:");
         emp.display();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid input!");
     }
 }
}

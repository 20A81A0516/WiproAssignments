package practice;
import java.io.*;
import java.util.Scanner;

public class SerializeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        EmpRecord emp = new EmpRecord(id, name, salary);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("\nEmployee object serialized successfully!");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            EmpRecord deserializedEmp = (EmpRecord) ois.readObject();
            System.out.println("\nDeserialized Employee Details:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}


/*
Enter Employee ID: 1001
Enter Employee Name: rahul
Enter Employee Salary: 50000

Employee object serialized successfully!

Deserialized Employee Details:
Employee ID: 1001
Employee Name: rahul
Employee Salary: 0.0
*/

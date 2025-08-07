package demos;
import java.util.Optional;

class Emp49 {
 private String name;
 private double salary;
 private Optional<String> email;
 private Optional<String> department;
 
 public Emp49(String name, double salary, String email, String department) {
     this.name = name;
     this.salary = salary;
     this.email = Optional.ofNullable(email);
     this.department = Optional.ofNullable(department);
 }

 public String getName() { return name; }
 public double getSalary() { return salary; }

 public String getEmailOrDefault() {
     return email.orElse("Email not provided");
 }

 public String getDepartmentOrThrow() {
     return department.orElseThrow(() -> new RuntimeException("Department is required!"));
 }
}

public class OptionalEmpDemo {
 public static void main(String[] args) {
     Emp49 e1 = new Emp49("Priya", 65000, null, "HR");

     Emp49 e2 = new Emp49("Arun", 55000, null, null);

     System.out.println("=== Employee 1 ===");
     System.out.println("Name: " + e1.getName());
     System.out.println("Email: " + e1.getEmailOrDefault());
     System.out.println("Department: " + e1.getDepartmentOrThrow());

     System.out.println("\n=== Employee 2 ===");
     System.out.println("Name: " + e2.getName());
     System.out.println("Email: " + e2.getEmailOrDefault());

     System.out.println("Department: " + e2.getDepartmentOrThrow());
 }
}

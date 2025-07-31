package demos;

class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}

class Emp {
 int id;
 String name;
 double salary;

 public Emp(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public double getSalary() {
     return salary;
 }

 public String getName() {
     return name;
 }
}

class EmployeeService {
 public void validateSalary(double salary) throws InvalidSalaryException {
     if (salary < 0) {
         throw new InvalidSalaryException("Salary cannot be negative.");
     }
 }

 public void processSalary(Emp emp) throws InvalidSalaryException {
     validateSalary(emp.getSalary());
     System.out.println("Salary processed for " + emp.getName());
 }

 public void startProcess(Emp emp) throws InvalidSalaryException {
     processSalary(emp);
 }
}

public class SalaryProcessorDemo {
 public static void main(String[] args) {
     Emp emp = new Emp(101, "John", -5000); 
     EmployeeService service = new EmployeeService();

     try {
         service.startProcess(emp);
     } catch (InvalidSalaryException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}



/*
Caught Exception: Salary cannot be negative.
*/
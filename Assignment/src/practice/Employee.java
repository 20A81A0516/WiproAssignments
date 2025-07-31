package practice;
public class Employee {
    private String employeeId;
    private String name;
    private int yearOfBirth;

    public Employee(String employeeId, String name, int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}


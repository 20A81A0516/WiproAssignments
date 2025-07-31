package demos;

public class Employee {
    private String empId;
    private String name;
    private int yearOfBirth;

    public Employee(String empId, String name, int yearOfBirth) {
        this.empId = empId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
        
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - yearOfBirth;
        System.out.println("Age: " + age);
    }

    public String getEmpId() { return empId; }
    public String getName() { return name; }
    public int getYearOfBirth() { return yearOfBirth; }
    
    public void setEmpId(String empId) { this.empId = empId; }
    public void setName(String name) { this.name = name; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }
}
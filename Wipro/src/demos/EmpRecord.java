package demos;

public class EmpRecord {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public EmpRecord(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
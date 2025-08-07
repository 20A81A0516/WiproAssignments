package demos;

public class Staff {

    int id;
    String name;
    String department;
    double salary;

    public Staff(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

package practice;
import java.io.Serializable;

public class EmpRecord implements Serializable {
    int emp_id;
    String emp_name;
    transient double emp_sal;  // marked transient so it won't be serialized

    // Constructor
    public EmpRecord(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    // Display method
    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_sal);  // Will print 0.0 after deserialization
    }
}


package practice;
import java.util.List;

public class RepositoryDemo {
    public static void main(String[] args) {
        Repository<Emp, Integer> repo = new Repository<>();

        Emp e1 = new Emp(1, "Alice", 50000);
        Emp e2 = new Emp(2, "Bob", 60000);
        Emp e3 = new Emp(3, "Charlie", 55000);

        repo.save(e1.getId(), e1);
        repo.save(e2.getId(), e2);
        repo.save(e3.getId(), e3);

        System.out.println("All Employees:");
        List<Emp> allEmps = repo.findAll();
        for (Emp emp : allEmps) {
            System.out.println(emp);
        }

        System.out.println("\nEmployee with ID 2:");
        Emp empById = repo.findById(2);
        System.out.println(empById);

        repo.deleteById(1);
        System.out.println("\nAfter deleting employee with ID 1:");
        List<Emp> remaining = repo.findAll();
        for (Emp emp : remaining) {
            System.out.println(emp);
        }
    }
}



/*
All Employees:
ID: 1, Name: Alice, Salary: 50000.0
ID: 2, Name: Bob, Salary: 60000.0
ID: 3, Name: Charlie, Salary: 55000.0

Employee with ID 2:
ID: 2, Name: Bob, Salary: 60000.0

After deleting employee with ID 1:
ID: 2, Name: Bob, Salary: 60000.0
ID: 3, Name: Charlie, Salary: 55000.0
*/
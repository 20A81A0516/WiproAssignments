package demos;

import java.util.List;

public class RepositoryDemo {
    public static void main(String[] args) {
        Repository<EmpRecord, Integer> repo = new Repository<>();

        EmpRecord e1 = new EmpRecord(1, "Alice", 50000);
        EmpRecord e2 = new EmpRecord(2, "Bob", 60000);
        EmpRecord e3 = new EmpRecord(3, "Charlie", 55000);

        repo.save(e1.getId(), e1);
        repo.save(e2.getId(), e2);
        repo.save(e3.getId(), e3);

        System.out.println("All Employees:");
        List<EmpRecord> allEmps = repo.findAll();
        for (EmpRecord emp : allEmps) {
            System.out.println(emp);
        }

        System.out.println("\nEmployee with ID 2:");
        EmpRecord empById = repo.findById(2);
        System.out.println(empById);

        repo.deleteById(1);
        System.out.println("\nAfter deleting employee with ID 1:");
        List<EmpRecord> remaining = repo.findAll();
        for (EmpRecord emp : remaining) {
            System.out.println(emp);
        }
    }
}


/*All Employees:
Emp [id=1, name=Alice, salary=50000.0]
Emp [id=2, name=Bob, salary=60000.0]
Emp [id=3, name=Charlie, salary=55000.0]

Employee with ID 2:
Emp [id=2, name=Bob, salary=60000.0]

After deleting employee with ID 1:
Emp [id=2, name=Bob, salary=60000.0]
Emp [id=3, name=Charlie, salary=55000.0]
*/
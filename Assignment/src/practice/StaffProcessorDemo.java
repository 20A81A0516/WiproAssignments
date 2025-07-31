package practice;
class Staff {
    int id;
    String name;
    double salary;

    Staff(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}
@FunctionalInterface
interface StaffProcessor {
    void process(Staff s);
}

public class StaffProcessorDemo {
    public static void main(String[] args) {
        Staff staff1 = new Staff(1, "Alice", 50000);
        Staff staff2 = new Staff(2, "Bob", 60000);

        StaffProcessor printDetails = s -> {
            System.out.println("Name: " + s.getName());
            System.out.println("Salary: " + s.getSalary());
        };

        StaffProcessor bonusCalculator = s -> {
            double bonus = s.getSalary() * 0.10;
            System.out.println("Bonus: " + bonus);
        };

        System.out.println("Staff 1:");
        printDetails.process(staff1);
        bonusCalculator.process(staff1);

        System.out.println("\nStaff 2:");
        printDetails.process(staff2);
        bonusCalculator.process(staff2);
    }
}


/*
Staff 1:
Name: Alice
Salary: 50000.0
Bonus: 5000.0

Staff 2:
Name: Bob
Salary: 60000.0
Bonus: 6000.0
*/

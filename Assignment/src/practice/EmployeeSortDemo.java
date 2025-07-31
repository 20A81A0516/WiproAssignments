package practice;

import java.util.*;

public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<MyEmployee> list = new ArrayList<>();

        list.add(new MyEmployee(101, "Alice", 50000));
        list.add(new MyEmployee(102, "Bob", 60000));
        list.add(new MyEmployee(103, "Charlie", 55000));
        list.add(new MyEmployee(104, "David", 60000));

        System.out.println("Before Sorting:");
        for (MyEmployee e : list) {
            e.display();
        }

        // Sort by salary in descending order
        Collections.sort(list, (e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("\nSorted by Salary (Descending):");
        for (MyEmployee e : list) {
            e.display();
        }

        // Sort by name alphabetically
        Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\nSorted by Name (Alphabetically):");
        for (MyEmployee e : list) {
            e.display();
        }
    }
}


/*
Before Sorting:
ID: 101, Name: Alice, Salary: 50000.0
ID: 102, Name: Bob, Salary: 60000.0
ID: 103, Name: Charlie, Salary: 55000.0
ID: 104, Name: David, Salary: 60000.0

Sorted by Salary (Descending):
ID: 102, Name: Bob, Salary: 60000.0
ID: 104, Name: David, Salary: 60000.0
ID: 103, Name: Charlie, Salary: 55000.0
ID: 101, Name: Alice, Salary: 50000.0

Sorted by Name (Alphabetically):
ID: 101, Name: Alice, Salary: 50000.0
ID: 102, Name: Bob, Salary: 60000.0
ID: 103, Name: Charlie, Salary: 55000.0
ID: 104, Name: David, Salary: 60000.0
*/
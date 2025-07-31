package practice;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {
    public static void main(String[] args) {
        List<MyStudent> students = new ArrayList<>();
        students.add(new MyStudent(1, "Alice", "CSE"));
        students.add(new MyStudent(2, "Bob", "ECE"));
        students.add(new MyStudent(3, "Charlie", "CSE"));
        students.add(new MyStudent(4, "David", "IT"));
        students.add(new MyStudent(5, "Eva", "ECE"));

        Map<String, List<MyStudent>> groupedByDept = students.stream()
            .collect(Collectors.groupingBy(s -> s.department));

        for (String dept : groupedByDept.keySet()) {
            System.out.println("Department: " + dept);
            for (MyStudent s : groupedByDept.get(dept)) {
                System.out.println(" - " + s.name);
            }
        }
    }
}



/*
Department: CSE
- Alice
- Charlie
Department: ECE
- Bob
- Eva
Department: IT
- David
*/
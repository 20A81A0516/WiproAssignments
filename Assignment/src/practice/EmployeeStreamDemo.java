package practice;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class EmployeeStreamData {
    int id;
    String name;
    String department;
    double salary;

    public EmployeeStreamData(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getId() { return id; }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<EmployeeStreamData> employees = Arrays.asList(
            new EmployeeStreamData(101, "Ravi", "HR", 50000),
            new EmployeeStreamData(102, "Priya", "IT", 60000),
            new EmployeeStreamData(103, "Arun", "HR", 55000),
            new EmployeeStreamData(104, "Kavya", "IT", 70000),
            new EmployeeStreamData(105, "Divya", "Sales", 45000)
        );
        System.out.println("Q1: All employee names:");
        employees.stream().map(e -> e.name).forEach(System.out::println);

        System.out.println("\nQ2: Employees with salary > 55000:");
        employees.stream().filter(e -> e.salary > 55000).forEach(System.out::println);

        long countHR = employees.stream().filter(e -> e.department.equals("HR")).count();
        System.out.println("\nQ3: Number of employees in HR: " + countHR);

        System.out.println("\nQ4: Employees sorted by salary (desc):");
        employees.stream().sorted(Comparator.comparing(EmployeeStreamData::getSalary).reversed())
                .forEach(System.out::println);

        Optional<EmployeeStreamData> maxSalaryEmp = employees.stream().max(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nQ5: Highest paid employee: " + maxSalaryEmp.get());

        double avgSalary = employees.stream().mapToDouble(e -> e.salary).average().orElse(0);
        System.out.println("\nQ6: Average salary: " + avgSalary);

        List<String> allNames = employees.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println("\nQ7: All names: " + allNames);

        Map<String, List<EmployeeStreamData>> groupByDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment));
        System.out.println("\nQ8: Grouped by department:");
        groupByDept.forEach((dept, list) -> System.out.println(dept + " -> " + list));

        Map<String, Double> totalSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment, Collectors.summingDouble(e -> e.salary)));
        System.out.println("\nQ9: Total salary per department: " + totalSalaryPerDept);

        System.out.println("\nQ10: IT employees sorted by salary:");
        employees.stream().filter(e -> e.department.equals("IT"))
                .sorted(Comparator.comparing(EmployeeStreamData::getSalary))
                .forEach(System.out::println);

        boolean hasLowSalary = employees.stream().anyMatch(e -> e.salary < 40000);
        System.out.println("\nQ11: Any salary < 40000? " + hasLowSalary);

        String namesCommaSeparated = employees.stream().map(e -> e.name).collect(Collectors.joining(", "));
        System.out.println("\nQ12: Comma-separated names: " + namesCommaSeparated);

        List<EmployeeStreamData> top2 = employees.stream()
                .sorted(Comparator.comparing(EmployeeStreamData::getSalary).reversed())
                .limit(2).collect(Collectors.toList());
        System.out.println("\nQ13: Top 2 highest earners: " + top2);

        System.out.println("\nQ14: After skipping first 2 employees:");
        employees.stream().skip(2).forEach(System.out::println);

        System.out.println("\nQ15: First 3 employees:");
        employees.stream().limit(3).map(e -> e.name).forEach(System.out::println);

        Optional<EmployeeStreamData> minHr = employees.stream()
                .filter(e -> e.department.equals("HR"))
                .min(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nQ16: Min salary in HR: " + minHr.get());

        Map<Boolean, List<EmployeeStreamData>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.salary > 55000));
        System.out.println("\nQ17: Salary partitioned:");
        partitioned.forEach((cond, list) -> System.out.println((cond ? ">55000" : "<=55000") + ": " + list));

        Map<String, Double> avgSalaryDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment,
                        Collectors.averagingDouble(e -> e.salary)));
        System.out.println("\nQ18: Average salary per department: " + avgSalaryDept);

        System.out.println("\nQ19: Sorted by name then salary:");
        employees.stream().sorted(Comparator.comparing(EmployeeStreamData::getName)
                        .thenComparing(EmployeeStreamData::getSalary))
                .forEach(System.out::println);

        Map<Integer, String> idNameMap = employees.stream()
                .collect(Collectors.toMap(e -> e.id, e -> e.name));
        System.out.println("\nQ20: Map<Id, Name>: " + idNameMap);

        System.out.println("\nChallenge 1: Names starting with D and ending with a:");
        employees.stream().filter(e -> e.name.startsWith("D") && e.name.endsWith("a")).forEach(System.out::println);

        System.out.println("\nChallenge 2: Departments with more than 1 employee:");
        groupByDept.entrySet().stream().filter(entry -> entry.getValue().size() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nChallenge 3: Second highest salary:");
        Optional<Double> secondHighestSalary = employees.stream().map(e -> e.salary).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Second highest salary: " + secondHighestSalary.orElse(-1.0));
    }
}





/*
Q1: All employee names:
Ravi
Priya
Arun
Kavya
Divya

Q2: Employees with salary > 55000:
102 Priya IT 60000.0
104 Kavya IT 70000.0

Q3: Number of employees in HR: 2

Q4: Employees sorted by salary (desc):
104 Kavya IT 70000.0
102 Priya IT 60000.0
103 Arun HR 55000.0
101 Ravi HR 50000.0
105 Divya Sales 45000.0

Q5: Highest paid employee: 104 Kavya IT 70000.0

Q6: Average salary: 56000.0

Q7: All names: [Ravi, Priya, Arun, Kavya, Divya]

Q8: Grouped by department:
Sales -> [105 Divya Sales 45000.0]
HR -> [101 Ravi HR 50000.0, 103 Arun HR 55000.0]
IT -> [102 Priya IT 60000.0, 104 Kavya IT 70000.0]

Q9: Total salary per department: {Sales=45000.0, HR=105000.0, IT=130000.0}

Q10: IT employees sorted by salary:
102 Priya IT 60000.0
104 Kavya IT 70000.0

Q11: Any salary < 40000? false

Q12: Comma-separated names: Ravi, Priya, Arun, Kavya, Divya

Q13: Top 2 highest earners: [104 Kavya IT 70000.0, 102 Priya IT 60000.0]

Q14: After skipping first 2 employees:
103 Arun HR 55000.0
104 Kavya IT 70000.0
105 Divya Sales 45000.0

Q15: First 3 employees:
Ravi
Priya
Arun

Q16: Min salary in HR: 101 Ravi HR 50000.0

Q17: Salary partitioned:
<=55000: [101 Ravi HR 50000.0, 103 Arun HR 55000.0, 105 Divya Sales 45000.0]
>55000: [102 Priya IT 60000.0, 104 Kavya IT 70000.0]

Q18: Average salary per department: {Sales=45000.0, HR=52500.0, IT=65000.0}

Q19: Sorted by name then salary:
103 Arun HR 55000.0
105 Divya Sales 45000.0
104 Kavya IT 70000.0
102 Priya IT 60000.0
101 Ravi HR 50000.0

Q20: Map<Id, Name>: {101=Ravi, 102=Priya, 103=Arun, 104=Kavya, 105=Divya}

Challenge 1: Names starting with D and ending with a:
105 Divya Sales 45000.0

Challenge 2: Departments with more than 1 employee:
HR: [101 Ravi HR 50000.0, 103 Arun HR 55000.0]
IT: [102 Priya IT 60000.0, 104 Kavya IT 70000.0]

Challenge 3: Second highest salary:
Second highest salary: 60000.0
*/

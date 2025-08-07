package demos;
import java.util.*;
import java.util.stream.*;
public class StaffStreamDemo {

    public static void main(String[] args) {
        List<Staff> staffList = Arrays.asList(
            new Staff(101, "Ravi", "HR", 50000),
            new Staff(102, "Priya", "IT", 60000),
            new Staff(103, "Arun", "HR", 55000),
            new Staff(104, "Kavya", "IT", 70000),
            new Staff(105, "Divya", "Sales", 45000)
        );

        System.out.println("Q1: All Staff Names:");
        staffList.stream().map(Staff::getName).forEach(System.out::println);

        System.out.println("\nQ2: Staff with Salary > 55000:");
        staffList.stream().filter(s -> s.getSalary() > 55000).forEach(System.out::println);

        long hrCount = staffList.stream().filter(s -> s.getDepartment().equals("HR")).count();
        System.out.println("\nQ3: Number of HR Staff: " + hrCount);

        System.out.println("\nQ4: Staff Sorted by Salary Desc:");
        staffList.stream().sorted(Comparator.comparing(Staff::getSalary).reversed()).forEach(System.out::println);

        Staff highest = staffList.stream().max(Comparator.comparing(Staff::getSalary)).get();
        System.out.println("\nQ5: Highest Paid Staff: " + highest);

        double avgSalary = staffList.stream().mapToDouble(Staff::getSalary).average().orElse(0.0);
        System.out.println("\nQ6: Average Salary: " + avgSalary);

        List<String> names = staffList.stream().map(Staff::getName).collect(Collectors.toList());
        System.out.println("\nQ7: Names List: " + names);

        Map<String, List<Staff>> groupByDept = staffList.stream().collect(Collectors.groupingBy(Staff::getDepartment));
        System.out.println("\nQ8: Grouped by Department:");
        groupByDept.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Double> totalSalaryPerDept = staffList.stream()
            .collect(Collectors.groupingBy(Staff::getDepartment, Collectors.summingDouble(Staff::getSalary)));
        System.out.println("\nQ9: Total Salary per Department: " + totalSalaryPerDept);

        List<String> sortedIT = staffList.stream()
            .filter(s -> s.getDepartment().equals("IT"))
            .sorted(Comparator.comparing(Staff::getSalary))
            .map(Staff::getName)
            .collect(Collectors.toList());
        System.out.println("\nQ10: IT Staff Sorted by Salary: " + sortedIT);

        boolean hasLowSalary = staffList.stream().anyMatch(s -> s.getSalary() < 40000);
        System.out.println("\nQ11: Any Staff with Salary < 40000: " + hasLowSalary);

        String commaNames = staffList.stream().map(Staff::getName).collect(Collectors.joining(", "));
        System.out.println("\nQ12: Comma-Separated Names: " + commaNames);
        
        List<Staff> top2 = staffList.stream()
            .sorted(Comparator.comparing(Staff::getSalary).reversed())
            .limit(2)
            .collect(Collectors.toList());
        System.out.println("\nQ13: Top 2 Highest Paid Staff: " + top2);

        System.out.println("\nQ14: Staff After Skipping First 2:");
        staffList.stream().skip(2).forEach(System.out::println);

        List<String> first3Names = staffList.stream().limit(3).map(Staff::getName).collect(Collectors.toList());
        System.out.println("\nQ15: First 3 Staff Names: " + first3Names);

        Optional<Staff> minHr = staffList.stream()
            .filter(s -> s.getDepartment().equals("HR"))
            .min(Comparator.comparing(Staff::getSalary));
        System.out.println("\nQ16: Min Salary in HR: " + (minHr.isPresent() ? minHr.get() : "None"));

        Map<Boolean, List<Staff>> partitioned = staffList.stream()
            .collect(Collectors.partitioningBy(s -> s.getSalary() > 55000));
        System.out.println("\nQ17: Partition by Salary > 55000:");
        partitioned.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Double> avgPerDept = staffList.stream()
            .collect(Collectors.groupingBy(Staff::getDepartment, Collectors.averagingDouble(Staff::getSalary)));
        System.out.println("\nQ18: Average Salary per Department: " + avgPerDept);

        System.out.println("\nQ19: Sorted by Name then Salary:");
        staffList.stream()
            .sorted(Comparator.comparing(Staff::getName).thenComparing(Staff::getSalary))
            .forEach(System.out::println);

        Map<Integer, String> idNameMap = staffList.stream()
            .collect(Collectors.toMap(Staff::getId, Staff::getName));
        System.out.println("\nQ20: Map<Id, Name>: " + idNameMap);

        System.out.println("\nChallenge 1: Names Starting with D and Ending with a:");
        staffList.stream()
            .filter(s -> s.getName().startsWith("D") && s.getName().endsWith("a"))
            .forEach(System.out::println);

        System.out.println("\nChallenge 2: Departments with More Than 1 Staff:");
        groupByDept.entrySet().stream()
            .filter(entry -> entry.getValue().size() > 1)
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        Optional<Double> secondHighestSalary = staffList.stream()
            .map(Staff::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();
        System.out.println("\nChallenge 3: Second Highest Salary: " + secondHighestSalary.orElse(0.0));
    }
}



/*
 * Q1: All Staff Names:
Ravi
Priya
Arun
Kavya
Divya

Q2: Staff with Salary > 55000:
102 - Priya - IT - 60000.0
104 - Kavya - IT - 70000.0

Q3: Number of HR Staff: 2

Q4: Staff Sorted by Salary Desc:
104 - Kavya - IT - 70000.0
102 - Priya - IT - 60000.0
103 - Arun - HR - 55000.0
101 - Ravi - HR - 50000.0
105 - Divya - Sales - 45000.0

Q5: Highest Paid Staff: 104 - Kavya - IT - 70000.0

Q6: Average Salary: 56000.0

Q7: Names List: [Ravi, Priya, Arun, Kavya, Divya]

Q8: Grouped by Department:
Sales: [105 - Divya - Sales - 45000.0]
HR: [101 - Ravi - HR - 50000.0, 103 - Arun - HR - 55000.0]
IT: [102 - Priya - IT - 60000.0, 104 - Kavya - IT - 70000.0]

Q9: Total Salary per Department: {Sales=45000.0, HR=105000.0, IT=130000.0}

Q10: IT Staff Sorted by Salary: [Priya, Kavya]

Q11: Any Staff with Salary < 40000: false

Q12: Comma-Separated Names: Ravi, Priya, Arun, Kavya, Divya

Q13: Top 2 Highest Paid Staff: [104 - Kavya - IT - 70000.0, 102 - Priya - IT - 60000.0]

Q14: Staff After Skipping First 2:
103 - Arun - HR - 55000.0
104 - Kavya - IT - 70000.0
105 - Divya - Sales - 45000.0

Q15: First 3 Staff Names: [Ravi, Priya, Arun]

Q16: Min Salary in HR: 101 - Ravi - HR - 50000.0

Q17: Partition by Salary > 55000:
false: [101 - Ravi - HR - 50000.0, 103 - Arun - HR - 55000.0, 105 - Divya - Sales - 45000.0]
true: [102 - Priya - IT - 60000.0, 104 - Kavya - IT - 70000.0]

Q18: Average Salary per Department: {Sales=45000.0, HR=52500.0, IT=65000.0}

Q19: Sorted by Name then Salary:
103 - Arun - HR - 55000.0
105 - Divya - Sales - 45000.0
104 - Kavya - IT - 70000.0
102 - Priya - IT - 60000.0
101 - Ravi - HR - 50000.0

Q20: Map<Id, Name>: {101=Ravi, 102=Priya, 103=Arun, 104=Kavya, 105=Divya}

Challenge 1: Names Starting with D and Ending with a:
105 - Divya - Sales - 45000.0

Challenge 2: Departments with More Than 1 Staff:
HR: [101 - Ravi - HR - 50000.0, 103 - Arun - HR - 55000.0]
IT: [102 - Priya - IT - 60000.0, 104 - Kavya - IT - 70000.0]

Challenge 3: Second Highest Salary: 60000.0
*/

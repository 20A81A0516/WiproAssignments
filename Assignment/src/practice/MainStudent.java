package practice;
import java.util.*;
class Student {
    private static int counter = 1; 
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = counter++; 
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    public int getRollNo() { return rollNo; }
    public String getStudName() { return studName; }
    public int getMarksInEng() { return marksInEng; }
    public int getMarksInMaths() { return marksInMaths; }
    public int getMarksInScience() { return marksInScience; }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}


class Standard {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayRollNoAscending() {
        students.stream()
                .sorted(Comparator.comparing(Student::getRollNo))
                .forEach(s -> System.out.println(s.getRollNo() + " - " + s.getStudName()));
    }

    public void displayTopper() {
        Student top = Collections.max(students, Comparator.comparing(Student::getPercentage));
        System.out.println(top.getRollNo() + " - " + top.getStudName() + " (" + top.getPercentage() + "%)");
    }

    public void displayHighestMaths() {
        Student topMath = Collections.max(students, Comparator.comparing(Student::getMarksInMaths));
        System.out.println(topMath.getRollNo() + " - " + topMath.getStudName() + " (Maths: " + topMath.getMarksInMaths() + ")");
    }

    public void displayMathScienceOrder() {
        students.stream()
                .sorted(Comparator.comparing(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> System.out.println(s.getRollNo() + " - " + s.getStudName()));
    }

    public void displayRankList() {
        students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()))
                .forEach(s -> System.out.println(
                        "Roll: " + s.getRollNo() + ", Name: " + s.getStudName() +
                        ", Total: " + s.getTotalMarks() + ", %: " + s.getPercentage()));
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Standard std = new Standard();

        std.addStudent(new Student("Alice", 85, 90, 80));
        std.addStudent(new Student("Bob", 70, 75, 72));
        std.addStudent(new Student("Carol", 60, 85, 88));
        std.addStudent(new Student("David", 90, 95, 93));
        std.addStudent(new Student("Eva", 78, 82, 79));
        std.addStudent(new Student("Frank", 88, 90, 85));
        std.addStudent(new Student("Grace", 95, 98, 94));
        std.addStudent(new Student("Hank", 80, 70, 75));

        System.out.println("1. Roll No Ascending:");
        std.displayRollNoAscending();

        System.out.println("\n2. Topper:");
        std.displayTopper();

        System.out.println("\n3. Highest in Maths:");
        std.displayHighestMaths();

        System.out.println("\n4. Ascending by Math + Science:");
        std.displayMathScienceOrder();

        System.out.println("\n5. Rank List:");
        std.displayRankList();
    }
}



/*
1. Roll No Ascending:
1 - Alice
2 - Bob
3 - Carol
4 - David
5 - Eva
6 - Frank
7 - Grace
8 - Hank

2. Topper:
7 - Grace (95.66666666666667%)

3. Highest in Maths:
7 - Grace (Maths: 98)

4. Ascending by Math + Science:
8 - Hank
2 - Bob
5 - Eva
1 - Alice
3 - Carol
6 - Frank
4 - David
7 - Grace

5. Rank List:
Roll: 7, Name: Grace, Total: 287, %: 95.66666666666667
Roll: 4, Name: David, Total: 278, %: 92.66666666666667
Roll: 6, Name: Frank, Total: 263, %: 87.66666666666667
Roll: 1, Name: Alice, Total: 255, %: 85.0
Roll: 5, Name: Eva, Total: 239, %: 79.66666666666667
Roll: 3, Name: Carol, Total: 233, %: 77.66666666666667
Roll: 8, Name: Hank, Total: 225, %: 75.0
Roll: 2, Name: Bob, Total: 217, %: 72.33333333333333
*/
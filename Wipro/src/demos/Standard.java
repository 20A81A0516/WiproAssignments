package demos;
import java.util.*;

class Student {
    private static int rollCounter = 1; 
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = rollCounter++;
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}

public class Standard {
    List<Student> students = new ArrayList<>();

    public Standard() {
        students.add(new Student("Anu", 80, 90, 85));
        students.add(new Student("Bala", 75, 95, 88));
        students.add(new Student("Chitra", 60, 70, 65));
        students.add(new Student("David", 85, 92, 90));
        students.add(new Student("Esha", 78, 76, 80));
        students.add(new Student("Farhan", 88, 91, 85));
        students.add(new Student("Gita", 72, 70, 74));
        students.add(new Student("Hari", 90, 96, 89));
    }

    public void displayByRollNo() {
        System.out.println("\nStudents by Roll No:");
        students.stream()
            .sorted(Comparator.comparingInt(Student::getRollNo))
            .forEach(s -> System.out.println("RollNo: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void highestPercentageStudent() {
        Student top = students.stream()
            .max(Comparator.comparingDouble(Student::getPercentage))
            .orElse(null);
        if (top != null) {
            System.out.println("\nHighest Percentage: RollNo: " + top.getRollNo() + ", Name: " + top.getStudName());
        }
    }

    public void highestInMaths() {
        Student top = students.stream()
            .max(Comparator.comparingInt(Student::getMarksInMaths))
            .orElse(null);
        if (top != null) {
            System.out.println("\nHighest in Maths: RollNo: " + top.getRollNo() + ", Name: " + top.getStudName());
        }
    }

    public void sortByMathsAndScience() {
        System.out.println("\nSorted by Maths + Science Total:");
        students.stream()
            .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
            .forEach(s -> System.out.println("RollNo: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    public void displayWithRank() {
        System.out.println("\nAll Students by Rank (Descending):");
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
        int rank = 1;
        for (Student s : sorted) {
            System.out.printf("Rank: %d, RollNo: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }

    public static void main(String[] args) {
        Standard std = new Standard();
        std.displayByRollNo();
        std.highestPercentageStudent();
        std.highestInMaths();
        std.sortByMathsAndScience();
        std.displayWithRank();
    }
}

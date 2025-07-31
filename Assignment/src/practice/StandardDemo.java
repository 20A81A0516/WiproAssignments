package practice;
import java.util.*;
class Learner {
 private static int counter = 100;
 private int rollNo;
 private String name;
 private int marksEng, marksMaths, marksScience;

 public Learner(String name, int eng, int maths, int science) {
     this.rollNo = counter++;
     this.name = name;
     this.marksEng = eng;
     this.marksMaths = maths;
     this.marksScience = science;
 }

 public int getRollNo() {
     return rollNo;
 }

 public String getName() {
     return name;
 }

 public int getMarksEng() {
     return marksEng;
 }

 public int getMarksMaths() {
     return marksMaths;
 }

 public int getMarksScience() {
     return marksScience;
 }

 public int getTotal() {
     return marksEng + marksMaths + marksScience;
 }

 public double getPercentage() {
     return getTotal() / 3.0;
 }
}

public class StandardDemo {
 private List<Learner> learners;

 public StandardDemo() {
     learners = new ArrayList<>();

     // Adding 8 Learners
     learners.add(new Learner("Ravi", 70, 80, 90));
     learners.add(new Learner("Priya", 85, 75, 65));
     learners.add(new Learner("Arun", 60, 95, 88));
     learners.add(new Learner("Divya", 90, 85, 92));
     learners.add(new Learner("Kiran", 50, 40, 70));
     learners.add(new Learner("Sneha", 78, 80, 86));
     learners.add(new Learner("Gopal", 65, 60, 70));
     learners.add(new Learner("Meena", 88, 90, 85));
 }

 public void displayByRollNo() {
     System.out.println("\n--- Learners by Roll Number ---");
     learners.stream()
             .sorted(Comparator.comparingInt(Learner::getRollNo))
             .forEach(l -> System.out.println("Roll No: " + l.getRollNo() + ", Name: " + l.getName()));
 }

 public void displayTopPercentage() {
     System.out.println("\n--- Top Scorer by Percentage ---");
     Learner top = Collections.max(learners, Comparator.comparingDouble(Learner::getPercentage));
     System.out.println("Roll No: " + top.getRollNo() + ", Name: " + top.getName() +
             ", Percentage: " + top.getPercentage());
 }

 public void displayTopMaths() {
     System.out.println("\n--- Top Scorer in Maths ---");
     Learner topMath = Collections.max(learners, Comparator.comparingInt(Learner::getMarksMaths));
     System.out.println("Roll No: " + topMath.getRollNo() + ", Name: " + topMath.getName() +
             ", Maths Marks: " + topMath.getMarksMaths());
 }

 public void displayByMathsAndScience() {
     System.out.println("\n--- Learners by Maths + Science Total (Ascending) ---");
     learners.stream()
             .sorted(Comparator.comparingInt(l -> l.getMarksMaths() + l.getMarksScience()))
             .forEach(l -> System.out.println("Roll No: " + l.getRollNo() + ", Name: " + l.getName() +
                     ", Maths+Science: " + (l.getMarksMaths() + l.getMarksScience())));
 }

 public void displayRankList() {
     System.out.println("\n--- Rank List (Based on Percentage Descending) ---");
     List<Learner> ranked = new ArrayList<>(learners);
     ranked.sort((l1, l2) -> Double.compare(l2.getPercentage(), l1.getPercentage()));

     int rank = 1;
     for (Learner l : ranked) {
         System.out.println("Rank " + rank + ": Roll No: " + l.getRollNo() + ", Name: " + l.getName() +
                 ", Total: " + l.getTotal() + ", Percentage: " + l.getPercentage());
         rank++;
     }
 }

 public static void main(String[] args) {
     StandardDemo sd = new StandardDemo();
     sd.displayByRollNo();
     sd.displayTopPercentage();
     sd.displayTopMaths();
     sd.displayByMathsAndScience();
     sd.displayRankList();
 }
}



/*
--- Learners by Roll Number ---
Roll No: 100, Name: Ravi
Roll No: 101, Name: Priya
Roll No: 102, Name: Arun
Roll No: 103, Name: Divya
Roll No: 104, Name: Kiran
Roll No: 105, Name: Sneha
Roll No: 106, Name: Gopal
Roll No: 107, Name: Meena

--- Top Scorer by Percentage ---
Roll No: 103, Name: Divya, Percentage: 89.0

--- Top Scorer in Maths ---
Roll No: 102, Name: Arun, Maths Marks: 95

--- Learners by Maths + Science Total (Ascending) ---
Roll No: 104, Name: Kiran, Maths+Science: 110
Roll No: 106, Name: Gopal, Maths+Science: 130
Roll No: 101, Name: Priya, Maths+Science: 140
Roll No: 105, Name: Sneha, Maths+Science: 166
Roll No: 100, Name: Ravi, Maths+Science: 170
Roll No: 107, Name: Meena, Maths+Science: 175
Roll No: 103, Name: Divya, Maths+Science: 177
Roll No: 102, Name: Arun, Maths+Science: 183

--- Rank List (Based on Percentage Descending) ---
Rank 1: Roll No: 103, Name: Divya, Total: 267, Percentage: 89.0
Rank 2: Roll No: 107, Name: Meena, Total: 263, Percentage: 87.66666666666667
Rank 3: Roll No: 105, Name: Sneha, Total: 244, Percentage: 81.33333333333333
Rank 4: Roll No: 102, Name: Arun, Total: 243, Percentage: 81.0
Rank 5: Roll No: 100, Name: Ravi, Total: 240, Percentage: 80.0
Rank 6: Roll No: 101, Name: Priya, Total: 225, Percentage: 75.0
Rank 7: Roll No: 106, Name: Gopal, Total: 195, Percentage: 65.0
Rank 8: Roll No: 104, Name: Kiran, Total: 160, Percentage: 53.333333333333336
*/

package demos;

public class Student {
		// TODO Auto-generated method stub

		    private int rollNumber;        
		    public String name;           
		    String course;                
		    int x, y;                     

		    public void greet() {
		        System.out.println("Welcome to Java Basics!");
		    }

		    public void displayInfo() {
		        System.out.println("Student: " + rollNumber + " " + name + " " + course);
		    }

		    private int square(int n) {
		        return n * n;
		    }

		    void subtract(int p, int q) {
		        x = p;
		        y = q;
		        System.out.println("Subtract: " + (x - y));
		    }

		    public static void main(String[] args) {
		        Student s1 = new Student();

		        s1.greet();                  
		        s1.displayInfo();              


		        s1.rollNumber = 101;
		        s1.name = "Alice";
		        s1.course = "Math";

		        s1.displayInfo();          

		        int res = s1.square(5);
		        System.out.println("Square: " + res);      

		        System.out.println("Square: " + s1.square(3)); 

		        System.out.println("Square: " + new Student().square(4)); 
		
		        System.out.println("Before Subtract: " + s1.x + " " + s1.y);

		        s1.subtract(20, 5);            

		        System.out.println("After Subtract: " + s1.x + " " + s1.y); 

		        int marks = 100;
		        System.out.println("Local Variable (marks): " + marks);
	}

}


/*
Welcome to Java Basics!
Student: 0 null null
Student: 101 Alice Math
Square: 25
Square: 9
Square: 16
Before Subtract: 0 0
Subtract: 15
After Subtract: 20 5
Local Variable (marks): 100
*/

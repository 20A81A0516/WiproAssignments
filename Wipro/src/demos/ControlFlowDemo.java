package demos;

public class ControlFlowDemo {

	public static void main(String[] args) {
	
				int age = 20; 

				if (age >= 18) { 
					System.out.println("Eligible to vote");
				} else {
					System.out.println("Not eligible to vote");
				}

				// Nested if
				int marks = 85;
				if (marks > 50) {
					if (marks >= 85) {
						System.out.println("Excellent marks!");
					} else {
						System.out.println("Good marks!");
					}
				} else {
					System.out.println("You need to improve.");
				}

				// while loop 
				int i = 1; 
				while (i <= 3) {
					System.out.println("While Loop: " + i);
					i++; 
				}

				// do..while loop
				int j = 5;
				do {
					System.out.println("Do-While Loop: " + j);
					j++; 
				} while (j < 5); 

				// for loop
				for (int k = 1; k <= 3; k++) {
					System.out.println("For Loop: " + k);
				}

				int p = 1;
				for (; p <= 3;) {
					System.out.println("No increment in header: " + p);
					p++;
				}

				for (int q = 1; q <= 3; System.out.println("Header print: " + q++))
					;

				for (int x = 0, y = 3; x < 3 && y > 0; x++, y--) {
					System.out.println("x=" + x + " y=" + y);
				}

				// break example
				for (int a = 1; a <= 5; a++) {
					if (a == 3) {
						break; 
					}
					System.out.println("Break example: " + a);
				}
				System.out.println("After break loop");

				// continue example
				for (int b = 1; b <= 5; b++) {
					if (b == 3) {
						continue; 
					}
					System.out.println("Continue example: " + b);
				}
				System.out.println("After continue loop");

				// Ternary operator example
				int a1 = 5, b1 = 10;
				String result = (a1 > b1) ? "a1 is greater" : "b1 is greater";
				System.out.println("Ternary Result: " + result);

				// Nested ternary operator
				int x1 = 50, y1 = 70, z1 = 60;
				int largest = (x1 > y1) ? (x1 > z1 ? x1 : z1) : (y1 > z1 ? y1 : z1);
				System.out.println("Largest value is: " + largest);

				// Switch example
				int day = 2;
				String dayName;
				switch (day) {
					case 1:
						dayName = "Monday";
						break;
					case 2:
						dayName = "Tuesday";
						break;
					case 3:
						dayName = "Wednesday";
						break;
					default:
						dayName = "Invalid day";
				}
				System.out.println("Day is: " + dayName);
		
	}

}


/*
Eligible to vote
Excellent marks!
While Loop: 1
While Loop: 2
While Loop: 3
Do-While Loop: 5
For Loop: 1
For Loop: 2
For Loop: 3
No increment in header: 1
No increment in header: 2
No increment in header: 3
Header print: 1
Header print: 2
Header print: 3
x=0 y=3
x=1 y=2
x=2 y=1
Break example: 1
Break example: 2
After break loop
Continue example: 1
Continue example: 2
Continue example: 4
Continue example: 5
After continue loop
Ternary Result: b1 is greater
Largest value is: 70
Day is: Tuesday
*/
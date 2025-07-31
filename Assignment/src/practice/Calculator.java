package practice;

		class Calculator {
		    public void add(int a, int b) {
		        int result = a + b;
		        System.out.println("Addition = " + result);
		    }

		    public void diff(int a, int b) {
		        int result = a - b;
		        System.out.println("Difference = " + result);
		    }

		    public void mul(int a, int b) {
		        int result = a * b;
		        System.out.println("Multiplication = " + result);
		    }

		    public void div(int a, int b) {
		        if (b != 0) {
		            double result = (double) a / b;
		            System.out.println("Division = " + result);
		        } else {
		            System.out.println("Division by zero is not allowed.");
		        }
		    }

		    public static void main(String[] args) {
		        Calculator c = new Calculator();
		        c.add(10, 5);
		        c.diff(10, 5);
		        c.mul(10, 5);
		        c.div(10, 5);
		
	}

}
		
		
		
/*
Addition = 15
Difference = 5
Multiplication = 50
Division = 2.0
*/

package demos;

public class MethodOverloading {


		    int a, b;
		    String username;

		    void add(int x, int y) {  
		        int sum = x + y;
		        System.out.println("Sum of 2 ints: " + sum);
		    }

		    void add(float x, float y) { 
		        float sum = x + y;
		        System.out.println("Sum of 2 floats: " + sum);
		    }

		    void add(int x, int y, int z) { 
		        int sum = x + y + z;
		        System.out.println("Sum of 3 ints: " + sum);
		    }

		    void add(String name, int id) { 
		        username = name;
		        System.out.println("User: " + username + ", ID: " + id);
		    }

		    void add(int id, String name) { 
		        username = name;
		        System.out.println("ID: " + id + ", User: " + username);
		    }

		    void setValues(int a, int b) {
		        this.a = a;
		        this.b = b;
		        System.out.println("Values set using this: " + this.a + ", " + this.b);
		    }

		    void greet() {
		        System.out.println("Hello from greet() method!");
		    }

		    void start() {
		        greet();     
		        this.greet();   
		    }

		    public static void main(String[] args) {
		        MethodOverloading obj = new MethodOverloading();

		        System.out.println("Before setValues(): " + obj.a + ", " + obj.b); 
		        obj.setValues(5, 10); 

		        obj.add(3, 4);              
		        obj.add(1.5f, 2.5f);         
		        obj.add(1, 2, 3);            
		        obj.add("Alice", 101);       
		        obj.add(202, "Bob");         
		        obj.start();
		
	}

}


/*
Before setValues(): 0, 0
Values set using this: 5, 10
Sum of 2 ints: 7
Sum of 2 floats: 4.0
Sum of 3 ints: 6
User: Alice, ID: 101
ID: 202, User: Bob
Hello from greet() method!
Hello from greet() method!
*/

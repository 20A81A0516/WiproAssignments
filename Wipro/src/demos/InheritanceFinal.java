package demos;

		final class Admin {

			void login() {
				System.out.println("Admin login successful.");
			}
		}

		class A {

			final void show() {
				System.out.println("Class A: final show() method");
			}

			void display() {
				System.out.println("Class A: display() method");
			}
		}

		class B extends A {

			void display() {
				System.out.println("Class B: overridden display() method");
			}
		}

		public class InheritanceFinal {

			public static void main(String[] args) {

				final int x = 5;
				final char grade = 'A';

				System.out.println("Final value of x: " + x); 
				System.out.println("Final grade: " + grade); 

				Admin admin1 = new Admin();
				admin1.login(); 

				B obj = new B();
				obj.show();   
				obj.display();
		
	}

}
		
		
		
/*
Final value of x: 5
Final grade: A
Admin login successful.
Class A: final show() method
Class B: overridden display() method
*/

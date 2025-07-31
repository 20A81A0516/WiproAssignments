package demos;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method 

				byte x = 10;
				int y = x;      
				float z = y;     
				System.out.println(x + " " + y + " " + z); 

				int num = 130;       
				byte small = (byte) num; 
				System.out.println(num + " " + small);   

				byte a = 5;
				float b = 2.5f;
				float result = a * b; 
				System.out.println(a + " " + b + " " + result);
				System.out.println(123.456);        
				System.out.println((float) 123.456);  
				
				char c1 = 66; 
				char c2 = 100;   
				
				System.out.println("Char:: " + c1 + " " + c2); 
				c1++;
				c2++;
				System.out.println("Char(++):: " + c1 + " " + c2);

				c1--;
				c2--;
				System.out.println("Char(--):: " + c1 + " " + c2); 
				
				int value = 90;
				char letter = (char) value;
				System.out.println("Char:: " + letter);

	}

}

/*
10 10 10.0
130 -126
5 2.5 12.5
123.456
123.456
Char:: B d
Char(++):: C e
Char(--):: B d
Char:: Z
*/

package demos;
import java.util.*;
public class RemoveDuplicatesAndSumEven {

	public static void main(String[] args) {

		        int[] input = {2, 3, 54, 1, 6, 7, 7};

		        Set<Integer> uniqueSet = new LinkedHashSet<>();
		        for (int num : input) {
		            uniqueSet.add(num);
		        }

		        int sumEven = 0;
		        System.out.println("Unique elements:");
		        for (int num : uniqueSet) {
		            System.out.print(num + " ");
		            if (num % 2 == 0) {
		                sumEven += num;
		            }
		        }

		        System.out.println("\nSum of even numbers: " + sumEven);

	}

}

/*
Unique elements:
2 3 54 1 6 7 
Sum of even numbers: 62
*/
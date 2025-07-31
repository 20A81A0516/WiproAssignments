package demos;
import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Please enter the total number of eggs: ");
        int totalEggs=sc.nextInt();
        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;
        int dozen = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;
        System.out.printf(
            "Your number of eggs is %d gross, %d dozen, and %d%n",
            gross, dozen, leftover
        );
        sc.close();
	}
}



/*
Please enter the total number of eggs: 8
Your number of eggs is 0 gross, 0 dozen, and 8
*/
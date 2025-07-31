package practice;

public class Eggs {

	public static void main(String[] args) {
	
		        int eggs = 1342; 

		        int gross = eggs / 144;
		        int remainingAfterGross = eggs % 144;

		        int dozen = remainingAfterGross / 12;
		        int leftover = remainingAfterGross % 12;

		        System.out.println("Your number of eggs is " + gross + " gross, " +
		                           dozen + " dozen, and " + leftover);

	}

}



/*
Your number of eggs is 9 gross, 3 dozen, and 10
*/
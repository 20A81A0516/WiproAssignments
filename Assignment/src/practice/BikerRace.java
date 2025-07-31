package practice;
import java.util.Scanner;
public class BikerRace {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] speeds = new int[5];
		        int sum = 0;

		        System.out.println("Enter the speed of 5 bikers:");
		        for (int i = 0; i < 5; i++) {
		            speeds[i] = sc.nextInt();
		            sum += speeds[i];
		        }

		        double average = sum / 5.0;

		        System.out.println("Average Speed: " + average);

		        System.out.println("Qualifying racers (speed > average):");
		        for (int speed : speeds) {
		            if (speed > average) {
		                System.out.println(speed);
		            }
		        }

		        sc.close();
		
	}

}


/*Enter the speed of 5 bikers:
70
60
50
55
65
Average Speed: 60.0
Qualifying racers (speed > average):
70
65
*/

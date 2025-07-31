package demos;

public class SimplejaggedArray {

			public int[][] createMarksArray() {

				int[][] marks = new int[3][];

				marks[0] = new int[2]; 
				marks[1] = new int[3]; 
				marks[2] = new int[1]; 

				for (int i = 0; i < marks.length; i++) { 
					for (int j = 0; j < marks[i].length; j++) { 
						marks[i][j] = (j + 1) * 10; 
					}
				}

				return marks;
			}

			public void displayMarks() {

				int[][] result = createMarksArray();

				for (int i = 0; i < result.length; i++) { 
					for (int j = 0; j < result[i].length; j++) { 
						System.out.print(result[i][j] + " ");
					}
					System.out.println(); 
				}
			}

			public static void main(String[] args) {

				new SimplejaggedArray().displayMarks();
	}

}

/*
10 20 
10 20 30 
10 
*/

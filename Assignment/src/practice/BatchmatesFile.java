package practice;

import java.io.*;
import java.util.Scanner;

public class BatchmatesFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("batchmates.txt");

        try (FileWriter fw = new FileWriter(file)) {
            System.out.print("Enter number of batchmates: ");
            int count = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter name of batchmate " + i + ": ");
                String name = sc.nextLine();
                fw.write(name + "\n");
            }
            fw.flush();

            System.out.println("\nBatchmates stored in file 'batchmates.txt'.\nReading from file:");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Name: " + line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



/*
Enter number of batchmates: 3
Enter name of batchmate 1: rechal
Enter name of batchmate 2: priya
Enter name of batchmate 3: happy

Batchmates stored in file 'batchmates.txt'.
Reading from file:
Name: rechal
Name: priya
Name: happy
*/

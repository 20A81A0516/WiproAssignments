package practice;

import java.io.*;

public class ReadFileBufferedReader {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));) {
            String line;
            System.out.println("Reading file: " + fileName);
            while ((line = br.readLine()) != null) {
                System.out.println("Line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }}



/*
Reading file: sample.txt
Line: Hello this is a sample file
Line: It contains some text
Line: For BufferedReader example
*/
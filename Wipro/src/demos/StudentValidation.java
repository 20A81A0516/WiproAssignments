package demos;

import java.util.*;

public class StudentValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Register Number: ");
            String regNo = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register number must have 9 characters");
            }

            if (mobile.length() != 10) {
                throw new IllegalArgumentException("Mobile number must have 10 characters");
            }

            if (!mobile.matches("\\d+")) {
                throw new NumberFormatException("Mobile number must contain only digits");
            }

            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register number must contain only letters and digits");
            }

            System.out.println("valid");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
        }
    }
}

/*
 * Enter Register Number: AB1234567
Enter Mobile Number: 3521235678
valid
*/

package bank;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank[] customers = new Bank[5];
        customers[0] = new Saving("S001", "Rachel", 2, "Teacher", 3000, 0.05);
        customers[1] = new Current("C001", "John", 1, "Engineer", 5000, true, 0.04);
        customers[2] = new Current("C002", "Alice", 2, "Doctor", 6000, false, 0.03);
        customers[3] = new Saving("S002", "Bob", 1, "Artist", 2500, 0.06);
        customers[4] = new Current("C003", "David", 1, "Manager", 7000, true, 0.05);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number to search: ");
        String searchAcc = sc.nextLine();

        boolean found = false;
        int currentCount = 0;
        double currentTotalBalance = 0;

        for (Bank b : customers) {
 
            if (b.accNo.equalsIgnoreCase(searchAcc)) {
                found = true;
                System.out.println("\n--- Customer Found ---");
                System.out.println(b.toString());
                System.out.println("Calculated Balance: RM " + String.format("%.2f", b.calcBalance()));
            }

            if (b instanceof Current) {
                currentCount++;
                currentTotalBalance += b.calcBalance();
            }
        }

        if (!found) {
            System.out.println("Customer with account number " + searchAcc + " not found.");
        }

        System.out.println("\n--- Current Account Summary ---");
        System.out.println("Total Current Account Holders: " + currentCount);
        System.out.println("Total Balance in Current Accounts: RM " + String.format("%.2f", currentTotalBalance));

        sc.close();
    }
}


/*
Enter account number to search: C001

--- Customer Found ---
Account No: C001
Name: John
Gender: Male
Job: Engineer
Current Balance: RM 5000.0
Calculated Balance: RM 5050.00

--- Current Account Summary ---
Total Current Account Holders: 3
Total Balance in Current Accounts: RM 18430.00
*/
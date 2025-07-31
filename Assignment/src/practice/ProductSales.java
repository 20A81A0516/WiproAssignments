package practice;
import java.util.Scanner;

public class ProductSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        char choice = 'Y';

        do {
            System.out.print("Enter product number (1, 2, or 3): ");
            int product = sc.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            double price = 0;

            switch (product) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue;
            }

            double cost = price * quantity;
            total += cost;

            System.out.println("Cost for this product: ₹" + cost);

            System.out.print("Do you want to add more products? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Total Retail Value: ₹" + total);
        sc.close();
    }
}


/*
Enter product number (1, 2, or 3): 2
Enter quantity sold: 2
Cost for this product: ₹89.0
Do you want to add more products? (Y/N): y
Enter product number (1, 2, or 3): 1
Enter quantity sold: 3
Cost for this product: ₹67.5
Do you want to add more products? (Y/N): n
Total Retail Value: ₹156.5
*/
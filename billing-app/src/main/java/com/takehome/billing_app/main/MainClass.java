package com.takehome.billing_app.main;

import com.takehome.billing_app.bean.Product;
import com.takehome.billing_app.service.BillingException;
import com.takehome.billing_app.service.ProductService;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        while (true) {
            System.out.println("1. Generate Bill by entering code and quantity");
            System.out.println("2. Exit");

            System.out.print(""); 
            String line = sc.nextLine().trim();
            int option;
            try {
                option = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Enter option 1 to 2 only");
                continue;
            }

            switch (option) {
                case 1:
                    int code;
                    while (true) {
                        System.out.println("Enter product_code");
                        String codeLine = sc.nextLine().trim();
                        try {
                            code = Integer.parseInt(codeLine);
                        } catch (NumberFormatException nfe) {
                            System.out.println("Invalid product_code, it should be >0 and 4 digit +ve number");
                            continue;
                        }
                        if (!service.validateProductCode(code)) {
                            System.out.println("Invalid product_code, it should be >0 and 4 digit +ve number");
                            continue;
                        }
                        break;
                    }

                    try {
                        Product product = service.getProductDetails(code);
                        int qty;
                        while (true) {
                            System.out.println("Enter quantity");
                            String qline = sc.nextLine().trim();
                            try {
                                qty = Integer.parseInt(qline);
                            } catch (NumberFormatException nfe) {
                                System.out.println("Invalid quantity, it should be >0");
                                continue;
                            }
                            if (!service.validateQuantity(qty)) {
                                System.out.println("Invalid quantity, it should be >0");
                                continue;
                            }
                            break;
                        }

                        double total = service.calculatePrice(qty, product.getProduct_price());
                        System.out.println("Product Name: " + product.getProduct_name());
                        System.out.println("Product Category: " + product.getProduct_category());
                        System.out.println("Product Description: " + product.getProduct_description());
                        System.out.println("Product Price(Rs): " + product.getProduct_price());
                        System.out.println("Quantity: " + qty);
                        System.out.println("Total Bill Amount: Rs." + total);

                    } catch (BillingException be) {
                        System.out.println(be.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting. Thank you.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter option 1 to 2 only");
            }
        }
    }
}





/*
 * 1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code
123
Invalid product_code, it should be >0 and 4 digit +ve number
Enter product_code
1002
Enter quantity
5
Product Name: LEDTV
Product Category: electronics
Product Description: TV
Product Price(Rs): 45000.0
Quantity: 5
Total Bill Amount: Rs.225000.0
1. Generate Bill by entering code and quantity
2. Exit
1004
Enter option 1 to 2 only
1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code
1004
Enter quantity
1
Product Name: WASHINGMACHINE
Product Category: appliances
Product Description: Front load washer
Product Price(Rs): 25000.0
Quantity: 1
Total Bill Amount: Rs.25000.0
1. Generate Bill by entering code and quantity
2. Exit
2
Exiting. Thank you.
*/

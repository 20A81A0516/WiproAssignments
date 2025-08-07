package com.example.service;

public class ShoppingService {

    public void addToCart(String item) {
        System.out.println("Item added to cart: " + item);
    }

    public void makePayment(double amount) {
        System.out.println("Payment made: ₹" + amount);
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        // Uncomment to simulate error
        // throw new RuntimeException("Order placement failed!");
    }
}

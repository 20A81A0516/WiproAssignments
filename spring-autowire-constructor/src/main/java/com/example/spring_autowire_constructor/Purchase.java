package com.example.spring_autowire_constructor;

public class Purchase {
    private Product product;

    // Constructor-based autowiring
    public Purchase(Product product) {
        this.product = product;
        System.out.println("Purchase(Product) constructor called");
    }

    public void display() {
        System.out.println("Purchase Details:");
        product.showPrice();
    }
}


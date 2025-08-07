package com.example.spring_autowire_constructor;

public class Product {
    private int price;

    public Product() {
        System.out.println("Product default constructor called");
    }

    public Product(int price) {
        this.price = price;
        System.out.println("Product(int) constructor called");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showPrice() {
        System.out.println("Product Price: " + price);
    }
}

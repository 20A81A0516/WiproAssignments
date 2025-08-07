package com.example.grocery_store.model;

public class Order {
    private Long id;
    private String customerName;
    private String items;
    private double total;
    
    // Constructors
    public Order() {}
    
    public Order(Long id, String customerName, String items, double total) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.total = total;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getItems() {
        return items;
    }
    
    public void setItems(String items) {
        this.items = items;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
}
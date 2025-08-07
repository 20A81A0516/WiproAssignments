package com.example.spring_autowire_annotation;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private int categoryId;
    private String categoryName;

    public Category() {
        this.categoryId = 1;
        this.categoryName = "Electronics";
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

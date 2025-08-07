package com.example.valueinjector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class valueReader {

    @Value("${app.example.integer-value}")
    private Integer valueInteger;

    @Value("${app.example.decimal-value}")
    private Double valueDouble;

    @Value("${app.example.boolean-value}")
    private Boolean valueBoolean;

    public void printValues() {
        System.out.println("Integer Value: " + valueInteger);
        System.out.println("Decimal Value: " + valueDouble);
        System.out.println("Boolean Value: " + valueBoolean);
    }
}

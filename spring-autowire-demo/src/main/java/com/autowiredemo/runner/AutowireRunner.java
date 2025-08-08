package com.autowiredemo.runner;

import com.autowiredemo.model.Freshman;

public class AutowireRunner {
    public static void displayInfo(Freshman freshman) {
        System.out.println("Student Name: " + freshman.getName());
        System.out.println("Dorm Location: " + freshman.getRoom().getLocation());
    }
}

package org.animals;
public class Elephant {
    private String color;
    private double weight;
    private int age;

    public Elephant(String color, double weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Trumpet";
    }
}
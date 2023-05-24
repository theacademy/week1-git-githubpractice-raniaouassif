package org.example;

public class Dog {
    private String name;
    private double weight;
    public Dog() {

    };

    public Dog(String nameIn, double weightIn) {
        this.name = nameIn;
        this.weight = weightIn;
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.println("WOOF!");
    }

    public void sit() {
        System.out.println("Sitting...");
    }

}

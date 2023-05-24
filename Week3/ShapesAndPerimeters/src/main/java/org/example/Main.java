package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.3, "blue");
        double circlePer = circle.getPerimeter();
        System.out.println(circlePer);
    }
}
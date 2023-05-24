package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Prince");
        myDog.setWeight(3.4);

        Dog anotherDog = new Dog("Buster", 23.5);

        SimpleMath.add(2,3);
    }
}
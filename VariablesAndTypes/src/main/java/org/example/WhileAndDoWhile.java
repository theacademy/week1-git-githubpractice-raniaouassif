package org.example;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        // While loop
        int x = 0;
        int y = 0;
        while(x < 5) {
            System.out.println("x= " + x);
            x++;
        }

        // Do-while loop
        do  { // Will be executed once 
            System.out.println("y= " + y);
            y++;
        } while(y>10);

    }
}

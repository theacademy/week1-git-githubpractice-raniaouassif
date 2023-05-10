package org.example;

import java.util.Scanner;

public class LoopScan {
    public static void main(String[] args){
        String userInput;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter a string message");
            userInput = scan.nextLine();
            if(userInput.isEmpty() || userInput.isEmpty()) {
                System.out.println("You must enter something!");
            } else {
                System.out.println("Thank you for entering the message: " + userInput);
                break;
            }
        }
    }
}

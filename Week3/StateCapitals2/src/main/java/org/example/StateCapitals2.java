package org.example;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class StateCapitals2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Map<String, String> map = new HashMap<>();
        map.put("Alabama", "Montgomery");
        map.put("Alaska", "Juneau");
        map.put("Arizona", "Phoenix");
        map.put("Arkansas", "Little Rock");

        int numCapitals = 0;

        PrintWriter out = new PrintWriter("StateCapitals.txt");
        // Enhanced for loop
        for(String state : map.keySet()) {
            out.println(state + "-" + map.get(state));
        }
        out.flush();
        out.close();

        System.out.println(map.size() + " STATES & CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES");
        for(String state : map.keySet()) {
            System.out.print(state + " ");
        }

        System.out.println("\n=======");

        do{
            System.out.println("How many capitals do you want to guess ?\nPick a number between 1 & " + map.size());
            numCapitals = readInt(1, map.size());
        } while( numCapitals == -1);

        Random random = new Random();
        int correctAnswers = 0;

        for(int i = 0 ; i < numCapitals; i++ ){
            // Get a random state from the map
            String randomState = (String) map.keySet().toArray()[random.nextInt(map.size())];
            System.out.println("WHAT IS THE CAPITAL OF " + randomState.toUpperCase() + " ?");
            if(checkAnswer(map.get(randomState))) {
                System.out.println("NICE WORK! " + map.get(randomState).toUpperCase() + " IS CORRECT!");
                correctAnswers++;
            } else {
                System.out.println("INCORRECT. THE CAPITAL IS " + map.get(randomState).toUpperCase());
            }
            System.out.println("Your score is : " + correctAnswers + "/" + (i+1));
            map.remove(randomState);
        }

        System.out.println();

    }

    private static int readInt(int min, int max) {
        if(scan.hasNextInt()) {
            int input = scan.nextInt();
            if(input >= min && input <= max) {
                scan.nextLine();
                return input;
            }
        }
        System.out.println("Invalid input.");
        scan.nextLine();
        return -1;
    }

    private static boolean checkAnswer(String capital) {
        if(scan.hasNext()) {
            String userAnswer = scan.nextLine();
            if(userAnswer.toLowerCase().equals(capital.toLowerCase() )) {
                return true;
            }
        }
        return false;
    }


}
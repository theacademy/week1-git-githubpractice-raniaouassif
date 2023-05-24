package org.example;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    final private Scanner console = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return console.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return console.nextInt();
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        boolean validInput = false;
        int output;
        do {
            output = readInt(prompt);
            if(output >= min && output <= max) {
                validInput = true;
            }
        } while (!validInput);
        return output;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        return console.nextDouble();
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        boolean validInput = false;
        double output;
        do {
            output = readDouble(prompt);
            if(output >= min && output <= max) {
                validInput = true;
            }
        } while (!validInput);
        return output;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        return console.nextFloat();
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        boolean validInput = false;
        float output;
        do {
            output = readFloat(prompt);
            if(output >= min && output <= max) {
                validInput = true;
            }
        } while (!validInput);
        return output;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        boolean validInput = false;
        long output;
        do {
            output = readInt(prompt);
            if(output >= min && output <= max) {
                validInput = true;
            }
        } while (!validInput);
        return output;
    }
}

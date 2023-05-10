package org.example;

import java.util.Scanner;

public class PresentationScan {
    public static void main(String[] args) {
        //Block 1: Declare & Initialize variables
        String yourFullName;
        String yourFirstName;
        String yourLastName;
        Scanner scan = new Scanner(System.in);

        //Block 2: Calculate and process the data
        System.out.println("Please enter your first name");
        yourFirstName = scan.nextLine();
        System.out.println("Please enter your last name");
        yourLastName = scan.nextLine();

        //Block 3: Results
        yourFullName = yourFirstName + " " + yourLastName;

        //Block 4: Display output
        System.out.println("First name : " + yourFirstName);
        System.out.println("Last name : " + yourLastName);
        System.out.println("Full name : " + yourFullName);
    }
}

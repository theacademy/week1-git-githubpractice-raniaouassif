package org.example;

import java.util.Scanner;

public class PresentationScan {
    public static void main(String[] args) {
        //Block 1: Declare & Initialize variables
        String yourFullName, yourFirstName, yourLastName;
        int yourAge;
        Scanner scan = new Scanner(System.in);

        //Block 2: Calculate and process the data
        System.out.println("Please enter your first name");
        yourFirstName = scan.nextLine();
        System.out.println("Please enter your last name");
        yourLastName = scan.nextLine();
        System.out.println("Please enter your age");
        yourAge = scan.nextInt();

        //Block 3: Results
        yourFullName = yourFirstName + " " + yourLastName;

        //Block 4: Display output
        System.out.println("First name : " + yourFirstName);
        System.out.println("Last name : " + yourLastName);
        System.out.println("Full name : " + yourFullName);
        System.out.println("Age : " + yourAge);
        System.out.println("Next year, your age will be : " + (++yourAge));


    }
}

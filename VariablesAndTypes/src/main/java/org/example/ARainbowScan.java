package org.example;

import java.util.Scanner;

public class ARainbowScan {
    public static void main(String[] args) {
        //Block 1: Declare & Initialize variables
        int op1 = 0, op2 = 0, sum = 0;
        String sOp1, sOp2;
        Scanner scan = new Scanner(System.in);

        //Block 2: Calculate and process the data
        System.out.println("Please enter the first operand");
        sOp1 = scan.nextLine();

        System.out.println("Please enter the second operand");
        sOp2 = scan.nextLine();

        //Convert String to Integer
        op1 = Integer.parseInt(sOp1);
        op2 = Integer.parseInt(sOp2);
        //Block 3: Results

        sum = op1 + op2;

        //Block 4: Display output
        System.out.println("op1 : " + op1);
        System.out.println("op2 : " + op2);
        System.out.println("sum : " + sum);
    }
}

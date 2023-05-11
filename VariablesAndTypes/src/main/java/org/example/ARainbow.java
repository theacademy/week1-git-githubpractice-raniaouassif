package org.example;

public class ARainbow {
    public static void main(String[] args) {
        //Block 1: Declare & Initialize variables
        int height =10, width=20;
        short result=0;

        //Block 2: Calculate and process the data
        result = (short) (height*width); //Casting from wider data type to smaller data type


        //Block 3: Results

        //Block 4: Display output
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Result: " + result);


    }
}

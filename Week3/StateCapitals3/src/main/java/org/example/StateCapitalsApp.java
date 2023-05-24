package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitalsApp {
    static String FILENAME = "MoreStateCapitals.txt";
    static String DELIMITER = "::";

    static Scanner scanner = new Scanner(System.in);
    static Map<String, Capital> map = new HashMap<>();

    public static void main(String[] args)  throws IOException {
        // FileReader
        Scanner scanFile = new Scanner(
                new BufferedReader(new FileReader(FILENAME))
        );


        int counter = 0;
        String  currentLine;
        Capital currentCapital;
        while (scanFile.hasNextLine()) {
            currentLine = scanFile.nextLine();
            currentCapital = unmarshallCapital(currentLine);
            map.put(currentCapital.getState(), currentCapital);
        }

        System.out.println(map.size() + " STATE/CAPITAL PAIRS LOADED.\n==============================");
        for(String state : map.keySet()) {
            Capital capital = map.get(state);

            System.out.println(state
                    + " - "
                    + capital.getName()
                    + " | Pop: " + capital.getPopulation()
                    + " | Area: " + capital.getSquareMileage()
            );
        }

        System.out.println("Please enter the lower limit for capital city population:");
        int lowerLimit = scanner.nextInt();
        //Listing capitals with populations greater than lower limit
        for(String state : map.keySet()) {
            Capital capital = map.get(state);
            if(capital.getPopulation() <= lowerLimit ){
                System.out.println(state
                        + " - "
                        + capital.getName()
                        + " | Pop: " + capital.getPopulation()
                        + " | Area: " + capital.getSquareMileage()
                );
            }
        }
    }

    private int readInt(){
        if(scanner.hasNextInt()) {
            int output = scanner.nextInt();
            scanner.nextLine();
            return output;
        } else {
            System.out.println("Invalid input. ");
            scanner.nextLine();
            return -1;
        }
    }
    private static Capital unmarshallCapital(String capitalAsText){
        // capitalAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // Alabama::Montgomery::205764::155.4
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |       |          |      |     |
        // |Alabama|Montgomery|205764|155.4|
        // |       |          |      |     |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String[] capitalTokens = capitalAsText.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String capitalState = capitalTokens[0];
        String capitalName = capitalTokens[1];
        int capitalPopulation = Integer.parseInt(capitalTokens[2]);
        double capitalSquareMileage = Double.parseDouble(capitalTokens[3]);

        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        Capital capitalFromFile = new Capital(capitalName, capitalState, capitalPopulation, capitalSquareMileage);
        return capitalFromFile;
    }

}
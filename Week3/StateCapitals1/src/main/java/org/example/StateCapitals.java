package org.example;

import java.util.HashMap;
import java.util.Map;

public class StateCapitals {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Alabama", "Montgomery");
        map.put("Alaska", "Juneau");
        map.put("Arizona", "Phoenix");
        map.put("Arkansas", "Little Rock");

        //Print states only:
        System.out.println("STATES:\n" +
                "=======");
        for(String state : map.keySet()) {
            System.out.println(state);
        }

        //Print capitals only:
        System.out.println("\nCAPITALS:\n" +
                "=========");
        for(String state : map.keySet()) {
            System.out.println(map.get(state));
        }

        System.out.println("\nSTATE/CAPITAL PAIRS:\n" +
                "====================");
        // Print state names and capitals:
        for (String state : map.keySet()) {

            String capital = map.get(state);
            System.out.println(state + " - " + capital);
        }

    }
}
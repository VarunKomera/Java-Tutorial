package com.anudip.learning;

import java.util.HashMap;
import java.util.Map;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and scores to the Map
        cricketerScores.put("Virat Kohli", 120);
        cricketerScores.put("Rohit Sharma", 98);
        cricketerScores.put("Steve Smith", 85);
        cricketerScores.put("Kane Williamson", 110);
        cricketerScores.put("Joe Root", 75);

        // Search for a batsman name and display their score
        String batsmanName = "Rohit Sharma";
        if (cricketerScores.containsKey(batsmanName)) {
            int score = cricketerScores.get(batsmanName);
            System.out.println(batsmanName + "'s score: " + score);
        } else {
            System.out.println("Batsman not found in the records.");
        }
    }
}

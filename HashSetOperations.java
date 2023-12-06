package com.anudip.learning;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numberSet = new HashSet<>();

        // Add elements to the set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);

        // Display elements of the set
        System.out.println("Elements of the set: " + numberSet);

        // Check if the set contains the number 10
        if (numberSet.contains(10)) {
            System.out.println("The set contains number 10.");
        } else {
            System.out.println("The set does not contain number 10.");
        }

        // Remove number 15 from the set
        numberSet.remove(15);

        // Display the size of the set
        System.out.println("Size of the set after removing 15: " + numberSet.size());
    }
}


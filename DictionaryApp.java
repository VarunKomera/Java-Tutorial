package com.anudip.learning;

import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> dictionary = new TreeMap<>();

        System.out.println("Dictionary Application\n");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add word-definition pair");
            System.out.println("2. Retrieve definition of a word");
            System.out.println("3. Display all word-definition pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word-Definition pair added successfully!");
                    break;

                case 2:
                    System.out.print("Enter word to get definition: ");
                    String searchWord = scanner.nextLine();
                    if (dictionary.containsKey(searchWord)) {
                        System.out.println("Definition: " + dictionary.get(searchWord));
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;

                case 3:
                    System.out.println("All word-definition pairs:");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + " - " + dictionary.get(key));
                    }
                    break;

                case 4:
                    System.out.println("Exiting the dictionary application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
            System.out.println(); // For better readability
        }
    }
}

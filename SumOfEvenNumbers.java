package com.anudip.learning;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(7);
        numbers.add(12);

        // Calculate the sum of even numbers
        int sum = sumOfEvenNumbers(numbers);

        // Display the sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }

    // Method to calculate the sum of even numbers in an ArrayList
    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

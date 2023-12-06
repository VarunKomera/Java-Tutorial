package com.anudip.learning;

class CalculationThread extends Thread {
    private int[] arr;
    private double average;

    public CalculationThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (this) {
            // Calculate average of the first 10 numbers
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            average = sum / 10.0;
            System.out.println("Average of first 10 numbers: " + average);
            notify(); // Notify waiting thread
        }
    }

    public double getAverage() {
        return average;
    }
}

class SquareThread extends Thread {
    private int[] arr;

    public SquareThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                wait(); // Wait for calculation thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Print squares of the numbers in the array
            System.out.print("Squares of numbers in the array: ");
            for (int num : arr) {
                System.out.print(num * num + " ");
            }
        }
    }
}

public class MultiThreadExecution {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 15, 30};

        CalculationThread calcThread = new CalculationThread(arr);
        SquareThread squareThread = new SquareThread(arr);

        calcThread.start();
        squareThread.start();
    }
}

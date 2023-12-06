package com.anudip.learning;

import java.util.ArrayDeque;
import java.util.Queue;

public class HotPotatoGame {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> players = new ArrayDeque<>();

        // Add player names to the queue
        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Emma");
        players.add("Frank");

        System.out.println("Initial Players: " + players);

        int passes = 3; // Number of passes before a player is removed
        while (players.size() > 1) {
            for (int i = 0; i < passes; i++) {
                // Dequeue and enqueue players to simulate passing the potato
                String currentPlayer = players.poll();
                players.offer(currentPlayer);
            }

            // Player holding the "potato" is removed
            String removedPlayer = players.poll();
            System.out.println("Player removed: " + removedPlayer);
        }

        // Display the winner
        System.out.println("Winner: " + players.peek());
    }
}

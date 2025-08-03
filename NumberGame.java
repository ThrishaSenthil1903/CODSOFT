package com.Number;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsPlayed = 0;
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("🎲 Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Range 1 to 100
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n Round " + (roundsPlayed + 1));
            System.out.println("Guess the number between 1 and 100. You have " + attemptsLeft + " attempts!");

            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println(" Correct! You guessed the number.");
                    guessedCorrectly = true;
                    totalScore += attemptsLeft * 10; // Score based on remaining attempts
                } else if (userGuess < numberToGuess) {
                    System.out.println(" Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attemptsLeft--;
                if (!guessedCorrectly && attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                }
            }

            if (!guessedCorrectly) {
                System.out.println(" Out of attempts! The correct number was: " + numberToGuess);
            }

            roundsPlayed++;
            System.out.print("\n Do you want to play another round? (yes/no): ");
            scanner.nextLine(); // Consume newline
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n Game Over!");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Your total score: " + totalScore);
        System.out.println("Thanks for playing!");
        scanner.close();
    }

}


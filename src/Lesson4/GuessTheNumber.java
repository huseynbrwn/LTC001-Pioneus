package Lesson4;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = (int) (Math.random() * (maxRange - minRange));
        int maxAttempts = 5;
        int attemptsRemaining = maxAttempts;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);
        System.out.println("Attempts remaining: " + attemptsRemaining);
        while (attemptsRemaining > 0) {
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
                    attemptsRemaining--;
                    System.out.println("Attempts remaining: " + attemptsRemaining);
                    if (attemptsRemaining == 0) {
                        System.out.println("You've run out of attempts. The correct number was: " + targetNumber);
                    }
                }
            }

        maxAttempts--;
        }
    }

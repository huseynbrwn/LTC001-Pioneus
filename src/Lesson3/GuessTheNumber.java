package Lesson3;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = (int) (Math.random() * (minRange + maxRange));
        int attempts = 3;

        System.out.println("Welcome to the Guess the Number Game: ");
        System.out.println("Choose the number between " + minRange + " and " + maxRange);
        System.out.println("Attempts remaining: " + attempts);

        while (attempts > 0) {
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number!");
                break;
            } else {
                if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                attempts--;
                System.out.println("Attempts remaining: " + attempts);

                if (attempts == 0) {
                    System.out.println("You've run out of attempts!");
                }
            }
        }
    }
}

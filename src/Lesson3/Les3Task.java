package Lesson3;

import java.util.Scanner;

public class Les3Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter an integer
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        // Relational operators: Check if the integer is greater than 10
        if(num>10) {
            // Unary operators: If the integer is greater than 10, display its negation
            num = -num;
        }
//        boolean isGreaterThan10 = (num > 10);
//        if (isGreaterThan10) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        // Logical operators: Check if the integer is even or odd
//        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Scanner, Input, and Output: Ask the user to enter a decimal number
        System.out.println("Enter a decimal number: ");
        double num1 = scanner.nextDouble();
        System.out.println(num + num1);

        // Math.random: Generate a random number between 1 and 6 ad add it to the integer
        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println(randomNumber + num);

        // If-Else Introduction: Check if the final result is greater than 20
        if(num + num1 > 20) {
            System.out.println("The final result is larger than 20");
        } else {
            System.out.println("The final result is not larger than 20");
        }
    }
}

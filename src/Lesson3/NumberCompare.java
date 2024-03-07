package Lesson3;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the 3rd number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are equal!");
        } else {
            System.out.println("False");
        }
    }
}

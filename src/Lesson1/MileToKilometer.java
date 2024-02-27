package Lesson1;

import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}

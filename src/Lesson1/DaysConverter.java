package Lesson1;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        int year = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Years: " + year);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

    }
}

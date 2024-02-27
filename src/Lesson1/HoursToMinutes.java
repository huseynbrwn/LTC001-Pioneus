package Lesson1;

import java.util.Scanner;

public class HoursToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        double hours = scanner.nextDouble();
        double minutes = hours * 60;

        System.out.println(minutes + " minutes are equal to " + hours + " hours.");
    }
}

package Lesson2;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are young.");
        } else if (age <= 35) {
            System.out.println("You are middle-aged.");
        } else {
            System.out.println("You are old.");
        }
    }
}

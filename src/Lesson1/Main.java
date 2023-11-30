package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number!");
        int num1 = scanner.nextInt();
        System.out.println("Input the first number!");
        int num2 = scanner.nextInt();
        System.out.println("Overall: " + num1 + num2);
    }
}

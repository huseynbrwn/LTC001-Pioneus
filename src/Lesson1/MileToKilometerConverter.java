package Lesson1;

import java.util.Scanner;

public class MileToKilometerConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value: ");

        double input = scanner.nextDouble();
        double km = 1.6;

        System.out.println("Mile: " + input + "---" + input*km + "equals km");
    }

}

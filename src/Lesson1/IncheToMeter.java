package Lesson1;

import java.util.Scanner;

public class IncheToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in inches: ");
        double inches = scanner.nextDouble();

        double meters =  inches * 0.0254;
        System.out.println(inches + " inches equals to" + meters + " metres." );

    }
}

package Lesson2;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side of rectangle: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second side of rectangle: ");
        int num2 = scanner.nextInt();

        int area = num1 * num2;
        int perimeter = 2 * (num1 + num2);

        System.out.println("Area: " + area);
        System.out.println(("Perimeter " + perimeter));
    }
}

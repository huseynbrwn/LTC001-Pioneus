package Lesson4;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides of a triangle:");

        System.out.println("Side 1: ");
        int side1 = scanner.nextInt();

        System.out.println("Side 2: ");
        int side2 = scanner.nextInt();

        System.out.println("Side 3: ");
        int side3 = scanner.nextInt();

        boolean isValidTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);

        if (isValidTriangle) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("It is an Equilateral Triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("It is an Isosceles Triangle.");
            } else {
                System.out.println("It is a Scalene Triangle.");
            }
        } else {
            System.out.println("It is not a valid triangle.");
        }
        String triangleType = (isValidTriangle) ? "valid" : "invalid";
        System.out.println("The entered triangle is " + triangleType + ".");
    }
}

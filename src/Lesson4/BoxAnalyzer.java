package Lesson4;

import java.util.Scanner;

public class BoxAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of three sides of a rectangular box:");

        System.out.println("Length: ");
        double length = scanner.nextDouble();

        System.out.println("Width: ");
        double width = scanner.nextDouble();

        System.out.println("Height: ");
        double height = scanner.nextDouble();

        if (length <= 0 || width <= 0 || height <= 0 ) {
            System.out.println("Error. Invalid dimensions. Please enter positive values for length, width, and height.");
        } else {
            double volume = length * width * height;
            System.out.println("The volume of the box is: " + volume);

            String boxType = (length == width && width == height) ? "Cube" : (length == width || length == height || width == height) ? "Cuboid" : "Invalid";

            System.out.println("The box is a " + boxType + ".");

        }
    }
}

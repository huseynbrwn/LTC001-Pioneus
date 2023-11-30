package Lesson1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");
        double celcius = scanner.nextDouble();
        double farenheight = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " degree Celcius is equal to " + farenheight + " degree Farenheight.");
    }
}

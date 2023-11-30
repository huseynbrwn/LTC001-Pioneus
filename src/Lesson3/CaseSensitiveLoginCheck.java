package Lesson3;

import javax.swing.*;
import java.util.Scanner;

public class CaseSensitiveLoginCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        if(username.equals("Admin") && password.equals("P@ssword")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }
}

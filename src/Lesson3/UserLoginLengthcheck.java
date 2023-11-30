package Lesson3;

import java.util.Scanner;

public class UserLoginLengthcheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        if(username.length() > 5 && password.length() == 8) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login is failed");
        }
    }
}

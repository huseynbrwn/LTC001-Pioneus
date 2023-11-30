package Lesson4;

import java.util.Scanner;

public class ExamGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your exam score: ");
//        int score = scanner.nextInt();
//
//        if (score < 0 || score > 100) {
//            System.out.println("Error: Invalid score entered. Please enter a score between 0 and 100.");
//        } else {
//            if (score >= 91 && score <= 100) {
//                System.out.println("Your grade is A.");
//            } else if (score >= 81 && score <= 90) {
//                System.out.println("Your grade is B.");
//            } else if (score >= 71 && score <= 80) {
//                System.out.println("Your grade is C.");
//            } else if (score >= 61 && score <= 70) {
//                System.out.println("Your grade is D.");
//            } else {
//                System.out.println("Your grade is F.");
//            }
        int score = scanner.nextInt();
        int updateScore = score /10;
        int remaining = score % 10;

        if (remaining==0){
            updateScore--;
        }


        switch (updateScore) {
            case 10:
            case 9:
                System.out.println("Your grade is A.");
                break;
            case 8:
                System.out.println("Your grade is B.");
                break;
            case 7:
                System.out.println("Your grade is C.");
                break;
            case 6:
                System.out.println("Your grade is D.");
                break;
            default:
                System.out.println("Your grade is F.");
        }
//        char grade = (score >= 91) ?
//                                 'A' :
//                     (score >= 81) ? 'B' :
//                             (score >= 71) ? 'C' :
//                                (score >= 61) ? 'D' : 'F';
//        System.out.println("Your grade is " + grade + " (using ternary operator).");

    }
}

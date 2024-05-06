package org.algorithm.CONDITIONAL.SWITCH;
// 3. Write a program to check if a number is odd or even number using switch statement

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Check whether the number is odd or even using a switch statement
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
            case -1:
                System.out.println(number + " is an odd number.");
                break;
        }

        scanner.close();
    }
}

package org.algorithm.CONDITIONAL.SWITCH;
// 1. Write a program to read a weekday number and print weekly name using switch statement

import java.util.Scanner;

public class WeekdayNumName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weekday number
        System.out.println("Enter weekday number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday):");
        int weekdayNumber = scanner.nextInt();

        // Initialize variable to hold weekday name
        String weekdayName;

        // Determine weekday name based on weekday number using switch statement
        switch (weekdayNumber) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid weekday number";
        }

        // Output weekday name
        System.out.println("Weekday name: " + weekdayName);

        scanner.close();
    }
}

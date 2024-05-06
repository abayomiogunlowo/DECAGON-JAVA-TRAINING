package org.algorithm.CONDITIONAL.ifAndElseIf;
// A library charges a fine for every book returned late.
// For first 5 days the fine is 50 Naira, for 6-10 days fine is 100 Naira and above 10 days fine is 500 Naira.
// If you return the book after 30 days your membership will be cancelled.
// Write a program to accept the number of days the member is late to return the book and display the fine or the appropriate message


import java.util.Scanner;

public class LibraryCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days the member is late
        System.out.println("Enter number of days the member is late:");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        int fine = 0;
        if (daysLate <= 5) {
            fine = 50;
        } else if (daysLate <= 10) {
            fine = 100;
        } else if (daysLate > 10 && daysLate <= 30) {
            fine = 500;
        } else {
            System.out.println("Membership cancelled due to returning the book after 30 days.");
            System.exit(0);
        }

        // Output fine
        System.out.println("Fine: " + fine + " Naira");

        scanner.close();
    }
}
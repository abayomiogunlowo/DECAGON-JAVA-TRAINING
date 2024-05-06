package org.algorithm.CONDITIONAL.ifAndElseIf;
//The marks obtained by a student in 5 different subjects are input through the keyboard.
// The student gets a division as per the following rules:
// Write a program to calculate the division obtained by the student
//
//Percentage above or equal to 60 - First division
//Percentage between 50 and 59 - Second division
//Percentage between 40 and 49 - Third division
//Percentage less than 40 – Fail

import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for five subjects
        System.out.println("Enter marks for five subjects (separated by spaces):");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate percentage
        double percentage = (totalMarks / 5.0);

        // Determine division based on percentage
        String division;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50 && percentage <= 59) {
            division = "Second Division";
        } else if (percentage >= 40 && percentage <= 49) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

        // Output division
        System.out.println("Division: " + division);

        scanner.close();
    }
}

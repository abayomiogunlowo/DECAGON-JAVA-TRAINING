package org.algorithm.CONDITIONAL.ifAndElseIf;
//Calculate Student Percentage and Grade in Java
//        Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
//        Calculate percentage and grade according to following:

//        Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F

//        This Java program takes five subject marks as input from the user and calculates the total and percentage of those marks.
//        It also assigns a grade based on the percentage obtained.


import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.println("Enter marks for Physics:");
        double physics = scanner.nextDouble();

        System.out.println("Enter marks for Chemistry:");
        double chemistry = scanner.nextDouble();

        System.out.println("Enter marks for Biology:");
        double biology = scanner.nextDouble();

        System.out.println("Enter marks for Mathematics:");
        double mathematics = scanner.nextDouble();

        System.out.println("Enter marks for Computer:");
        double computer = scanner.nextDouble();

        // Calculate total marks
        double totalMarks = physics + chemistry + biology + mathematics + computer;

        // Calculate percentage
        double percentage = (totalMarks / 500) * 100;

        // Determine grade based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

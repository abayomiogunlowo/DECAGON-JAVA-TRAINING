package org.algorithm.CONDITIONAL.ifAndElseIf;
// Write a program to input basic salary of an employee and calculate its Gross salary according to the following:

//        Basic Salary <= 10000 : HRA = 20%, DA = 80%
//        Basic Salary <= 20000 : HRA = 25%, DA = 90%
//        Basic Salary > 20000 : HRA = 30%, DA = 95%



import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary
        System.out.println("Enter basic salary:");
        double basicSalary = scanner.nextDouble();

        // Initialize variables for HRA and DA
        double hra = 0, da = 0;

        // Determine HRA and DA based on basic salary
        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;

        // Output gross salary
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}

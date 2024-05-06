package org.algorithm.CONDITIONAL.ifAndElseIf;
// While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
// If quantity and price per item are input through the keyboard,
// write a program to calculate the total expenses


import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter price per item:");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses without discount
        double totalExpenses = quantity * pricePerItem;

        // Apply discount if quantity is more than 100
        if (quantity > 100) {
            double discount = 0.1 * totalExpenses;
            totalExpenses -= discount;
            System.out.println("Discount applied: 10%");
        }

        // Output total expenses
        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}

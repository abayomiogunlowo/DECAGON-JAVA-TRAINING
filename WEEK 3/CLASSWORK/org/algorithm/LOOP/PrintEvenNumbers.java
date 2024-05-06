package org.algorithm.LOOP;
// Write a program to print all even numbers between 1 to 100

public class PrintEvenNumbers {
    public static void main(String[] args) {
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}

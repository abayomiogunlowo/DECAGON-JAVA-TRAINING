package org.algorithm.LOOP;
// Write a program to print reverse tables

public class ReverseMultiplicationTimesTable {
    public static void main(String[] args) {
        int number = 5;
        int limit = 10;
        reverseMultiplicationTimesTable(number, limit);
    }

    public static void reverseMultiplicationTimesTable(int number, int limit) {
        for (int i = limit; i >= 1; i--) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
package org.algorithm.LOOP;
// Write a program to print reverse alphabets from Z to A

public class PrintReverseAlphabets {
    public static void main(String[] args) {
        printReverseAlphabets();
    }

    public static void printReverseAlphabets() {
        char start = 'Z';
        char end = 'A';

        for (char c = start; c >= end; c--) {
            System.out.print(c + " ");
        }
    }
}

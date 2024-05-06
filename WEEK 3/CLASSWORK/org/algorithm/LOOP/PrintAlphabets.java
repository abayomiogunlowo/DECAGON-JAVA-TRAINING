package org.algorithm.LOOP;
// Write a program to print all alphabets from a to z

public class PrintAlphabets {
    public static void main(String[] args) {
        printAlphabets();
    }

    public static void printAlphabets() {
        char start = 'a';
        char end = 'z';

        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
    }
}

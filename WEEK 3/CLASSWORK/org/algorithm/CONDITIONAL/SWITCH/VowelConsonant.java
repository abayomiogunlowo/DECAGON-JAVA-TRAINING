package org.algorithm.CONDITIONAL.SWITCH;
// 2. Write a program to check whether a character is a vowel or consonant using switch statement

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Check whether the character is a vowel or consonant using a switch statement
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }

        scanner.close();
    }
}
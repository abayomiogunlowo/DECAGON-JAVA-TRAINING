package org.algorithm.CONDITIONAL.ifAndElseIf;

import java.util.Objects;
import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        if (inputString.length() > 5) {
            if (Objects.equals(inputString.charAt(1),'C')) {
                System.out.println(inputString.charAt(1));
            } else {
                System.out.println("The second character is not equal to 'C'.");
            }
        } else {
            System.out.println("The length of the string is not greater than 5.");
        }
    }
}

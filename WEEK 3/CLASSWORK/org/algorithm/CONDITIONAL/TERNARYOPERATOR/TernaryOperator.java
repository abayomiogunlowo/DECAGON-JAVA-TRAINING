package org.algorithm.CONDITIONAL.TERNARYOPERATOR;


import java.util.Objects;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        // Ternary Operators
        String characterC = inputString.length() > 5?
                (Objects.equals(inputString.charAt(1),'C')? String.valueOf(inputString.charAt(1)):"The second character is not equal to 'C'.")
                :
                "The length of the string is not greater than 5.";
        System.out.println(characterC);
    }
}
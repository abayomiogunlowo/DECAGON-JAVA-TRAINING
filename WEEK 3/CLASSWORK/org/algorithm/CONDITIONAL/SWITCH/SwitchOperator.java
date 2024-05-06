package org.algorithm.CONDITIONAL.SWITCH;

import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        // Nested Switch
        switch (Boolean.toString(inputString.length()> 5)){
            case "true":
                // Run another switch
                switch (Boolean.toString(inputString.charAt(1) == 'c' || inputString.charAt(1) == 'C')){
                    case "true":
                        System.out.println("The second character is equal to 'C'.");
                        break;
                    default:
                        System.out.println("The second character is not equal to 'C'.");
                }
                break;
            default:
                System.out.println("The length of the string is not greater than 5.");
        }
    }
}

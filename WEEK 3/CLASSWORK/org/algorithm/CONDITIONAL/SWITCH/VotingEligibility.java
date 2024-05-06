import java.util.Scanner;
// rite a program to check whether a person is eligible to vote or Not using switch statement

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.println("Enter age:");
        int age = scanner.nextInt();

        // Check voting eligibility using switch-case statement
        String eligibility;
        switch (age) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
                eligibility = "eligible";
                break;
            default:
                eligibility = "not eligible";
        }

        // Output eligibility status
        System.out.println("You are " + eligibility + " to vote.");

        scanner.close();
    }
}

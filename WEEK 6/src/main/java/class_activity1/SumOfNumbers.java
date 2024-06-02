package class_activity1;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum); //
    }
}
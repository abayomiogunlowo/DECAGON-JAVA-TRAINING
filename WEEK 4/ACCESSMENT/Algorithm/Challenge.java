package Algorithm;

// Write a Java method named findNextSquare that takes a long integer num as input and returns the square of the next integer if num is a perfect square. Otherwise, return -1.
// Ensure your method accounts for edge cases and handles large input values efficiently.

public class Challenge {
    public static long findNextSquare(long num) {
        long sqrt = (long) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            long nextNum = sqrt + 1;
            return nextNum * nextNum;
        } else {
            return -1;
        }
    }
}
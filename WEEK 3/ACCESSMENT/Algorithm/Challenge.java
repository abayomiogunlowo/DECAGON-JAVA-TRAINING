package Algorithm;

// Write a Java method hasUniqueChars that takes a string as input and returns true if all characters in the string are unique, and false otherwise.
// Explain how your implementation works and provide examples of input strings along with their expected output.

public class Challenge {
    public static boolean hasUniqueChars(String str) {
        boolean[] charSet = new boolean[256];
        // Enter for loop
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefghij")); // Should return true
        System.out.println(hasUniqueChars("fabbccdeafg")); // Should return false
    }
}
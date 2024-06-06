//Write a function that takes a string input, and returns the first character that is not repeated anywhere in the string. Characters in strings consist of printable characters.
//
//As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.
//
//If a string contains all repeating characters, it should return the empty string ("").
//
//Documentation
//Challenge.firstNonRepeatingLetter(s)
//Parameters
//s: String - a string to be parsed
//
//Return Value
//String - the first character that is not repeated anywhere in the string
//
//        Examples
//s	Return Value
//Example #1	"stress"	"t"
//Example #2	"STreSS"	"T"
//Example #1 Explanation:
//In the input "stress", the function should return "t", since the letter t only occurs once in the string, and occurs first in the string.
//
//        TEMPLATE;
//
//public class Challenge {
//    public static String firstNonRepeatingLetter(String str) {
//
//        return "";
//    }
//}


public class Challenge {
    public static String firstNonRepeatingLetter(String str) {
        // Convert string to char array
        char[] chars = str.toCharArray();

        // Use a single pass to count occurrences and maintain original case
        for (int i = 0; i < chars.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < chars.length; j++) {
                if (i != j && Character.toLowerCase(chars[i]) == Character.toLowerCase(chars[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return Character.toString(chars[i]);
            }
        }

        // Return empty string if no unique character is found
        return "";
    }

    // Test cases for validation
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("Abayomi")); // Should return ""
        System.out.println(firstNonRepeatingLetter("VictOr")); // Should return ""
        System.out.println(firstNonRepeatingLetter("OgunloWO")); // Should return ""
    }
}

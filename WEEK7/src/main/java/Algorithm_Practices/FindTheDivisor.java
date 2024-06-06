package Algorithm_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheDivisor {
    public static void main(String[] args) {
        // Test cases
        System.out.println(divisors(12)); // Should return [2, 3, 4, 6]
        System.out.println(divisors(13)); // Should return []
        System.out.println(divisors(25)); // Should return [5]
    }

    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        if (n <= 1) {
            return result; // no divisors for numbers <= 1
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }

        return result;
    }
}

//
//
//@DisplayName("divisors")
//class DivisorsTest {
//    @Nested
//    @DisplayName("sample tests")
//    class SampleTests {
//
//        @Test
//        @DisplayName("basic cases")
//        public void basicCases() {
//            assertEquals(new ArrayList<Integer>(Arrays.asList(3, 5)), FindTheDivisor.divisors(15));
//            assertEquals(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 6)), FindTheDivisor.divisors(12));
//            assertEquals(new ArrayList<Integer>(Arrays.asList()), FindTheDivisor.divisors(13));
//        }
//    }
//}




//
//
//Explanation:
//Main Method:
//
//Provides some test cases to manually verify the output.
//divisors Method:
//
//Initializes an empty ArrayList<Integer> to store the divisors.
//Checks if n is less than or equal to 1. If true, returns an empty list since there are no divisors for numbers ≤ 1.
//Loops from 2 to n / 2 (inclusive) and adds numbers that evenly divide n to the result list.
//        Test Class (DivisorsTest):
//
//Uses JUnit to define nested test cases and verify the correctness of the divisors method.
//Includes basic cases to ensure the function works as expected.
//Constraints and Assumptions:
//The input n is between 0 and 1000, inclusive.
//The function correctly identifies and excludes the number 1 and n itself from the list of divisors.
//If n is prime, the function returns an empty list, as there are no divisors other than 1 and n itself.
//
//
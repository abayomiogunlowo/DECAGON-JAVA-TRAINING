package Algorithm_Practices;

public class DNACompliments {
    public static void main(String[] args) {
        // Test cases
        System.out.println(dnaComplement("A")); // T
        System.out.println(dnaComplement("T")); // A
        System.out.println(dnaComplement("C")); // G
        System.out.println(dnaComplement("G")); // C
        System.out.println(dnaComplement("ATTGC")); // TAACG
        System.out.println(dnaComplement("")); // (empty string)
    }

    public static String dnaComplement(String dna) {
        // We utilize a StringBuilder to efficiently construct the complementary DNA string
        StringBuilder complement = new StringBuilder();

        // iterating through each character in the input DNA string
        for (char base : dna.toCharArray()) {
            // using a switch-case structure to append the corresponding complementary base to the StringBuilder
            switch (base) {
                case 'R':
                    complement.append('H');
                    break;
                case 'O':
                    complement.append('A');
                    break;
                case 'Y':
                    complement.append('M');
                    break;
                case 'A':
                    complement.append('L');
                    break;
                case 'L':
                    complement.append('E');
                    break;
                case 'E':
                    complement.append('T');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA base: " + base);
            }
        }
        // finally converting it to a string and returning the result.
        return complement.toString();
    }
}

// We utilize a StringBuilder to efficiently construct the complementary DNA string by iterating through each character in the input DNA string
// and using a switch-case structure to append the corresponding complementary base to the StringBuilder, finally converting it to a string and returning the result.
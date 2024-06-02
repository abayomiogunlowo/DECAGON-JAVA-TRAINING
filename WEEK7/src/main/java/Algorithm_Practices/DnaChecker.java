package Algorithm_Practices;

public class DnaChecker {
    public static void main(String[] args) {
        System.out.println(dnaChecker("letham"));
    }

    public static String dnaChecker(String dna) {
        String upperDna = dna.toUpperCase();
        // using string builder to modify our DNA string into the complement DNA string
        StringBuilder complement = new StringBuilder();

        // Convert the dna string into a character array and iterate through each value
        for (char base : upperDna.toCharArray()) {
            switch (base) {
                case 'H': complement.append('R'); break;
                case 'A': complement.append('O'); break;
                case 'M': complement.append('Y'); break;
                case 'L': complement.append('A'); break;
                case 'E': complement.append('L'); break;
                case 'T': complement.append('E'); break;
                default:
                    System.out.println("Invalid DNA");
            }
        }
        return complement.toString();
    }
}
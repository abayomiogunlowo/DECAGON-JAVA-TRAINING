package Algorithm_Practices;

public class DNACompliments {
    public static void main(String[] args) {
        System.out.println( dnaComplement("") );
    }

    public static String dnaComplement(String dna) {
        String uppercaseDna = dna.toUpperCase();
        StringBuilder complement = new StringBuilder();

        for (char base : uppercaseDna.toCharArray()) {
            switch (base) {
                case 'A': complement.append("T"); break;
                case 'T': complement.append("A"); break;
                case 'C': complement.append("G"); break;
                case 'G': complement.append("C"); break;
                default :
                    System.out.println("Unrecognized complement");
            }
        }

        return complement.toString();
    }
}
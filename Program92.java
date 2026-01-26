import java.util.*;

class Program92 {

    public static void decodeSequence(String binarySequence) {

        // Identify sequence type
        String typeBits = binarySequence.substring(0, 3);
        boolean isDNA = typeBits.equals("000");

        StringBuilder result = new StringBuilder();

        // Decode remaining bits
        for (int i = 3; i < binarySequence.length(); i += 3) {
            String code = binarySequence.substring(i, i + 3);
            char base;

            switch (code) {
                case "001": base = 'C'; break;
                case "010": base = 'G'; break;
                case "011": base = 'A'; break;
                case "101": base = 'T'; break;
                case "110": base = 'U'; break;
                default:  continue; // safety
            }

            // Fix invalid nucleobase
            if (isDNA && base == 'U') base = 'T';
            if (!isDNA && base == 'T') base = 'U';

            result.append(base);
        }

        System.out.print(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binarySequence = sc.nextLine();
        decodeSequence(binarySequence);
    }
}

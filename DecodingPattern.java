import java.util.*;

class DecodingPattern {

    public static void main(String[] args) {
        String str = "a2b3c1d4e6";
        System.out.println(decode(str));
    }

    public static String decode(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (i = i + 1; i < str.length() && Character.isDigit(str.charAt(i));i++) {

                count = Character.isDigit(str.charAt(i))? count * 10 + (str.charAt(i) - '0'): count;
            }

            i--; // index correction

            for (int j = 0; j < count; j++) {
                result += ch;
            }
        }
        return result;
    }
}

import java.util.Scanner;

class Program99 {

    public static String[] getPasswordStrength(String[] passwords, String[] common_words) {

        int n = passwords.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String pwd = passwords[i];

            // Rule 5: length < 6
            if (pwd.length() < 6) {
                result[i] = "weak";
                continue;
            }

            boolean allDigit = true;
            boolean allUpper = true;
            boolean allLower = true;

            for (int j = 0; j < pwd.length(); j++) {
                char c = pwd.charAt(j);

                if (!Character.isDigit(c)) allDigit = false;
                if (!Character.isUpperCase(c)) allUpper = false;
                if (!Character.isLowerCase(c)) allLower = false;
            }

            // Rule 3, 4
            if (allDigit || allUpper || allLower) {
                result[i] = "weak";
                continue;
            }

            boolean weakByDictionary = false;

            for (int k = 0; k < common_words.length; k++) {
                String word = common_words[k];

                // Rule 1 & 2
                if (pwd.equals(word) || pwd.contains(word)) {
                    weakByDictionary = true;
                    break;
                }
            }

            result[i] = weakByDictionary ? "weak" : "strong";
        }

        return result;
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] passwords = new String[n];
        for (int i = 0; i < n; i++) {
            passwords[i] = sc.nextLine();
        }

        int m = Integer.parseInt(sc.nextLine());
        String[] common_words = new String[m];
        for (int i = 0; i < m; i++) {
            common_words[i] = sc.nextLine();
        }

        String[] result = getPasswordStrength(passwords, common_words);

        for (String r : result) {
            System.out.println(r);
        }
    }
}

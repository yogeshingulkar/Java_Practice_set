public class StringExample2 {

    public static void main(String[] args) {

        String str = "hippopotammmus";

        System.out.println("Frequency:");
        frequencyOfCharacters(str);

        System.out.println("\nDistinct : " + distinctCharacters(str));
        System.out.println("Unique : " + uniqueCharacters(str));
        System.out.println("Duplicate : " + duplicateCharacters(str));
        System.out.println("1st Highest repeating : " + highestRepeating(str));
        System.out.println("1st Lowest repeating : " + lowestRepeating(str));
    }

    // ---------------- FREQUENCY ----------------
    static void frequencyOfCharacters(String str) {

        String[] trace = new String[str.length()];
        int iNdx = 0;

        for (int i = 0; i < str.length(); i++) {

            String ch = str.charAt(i) + "";

            boolean alreadyDone = false;
            for (int k = 0; k < iNdx; k++) {
                if (trace[k].equals(ch)) {
                    alreadyDone = true;
                    break;
                }
            }

            if (alreadyDone)
                continue;

            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) + "").equals(ch))
                    cnt++;
            }

            trace[iNdx++] = ch;
            System.out.println(ch + " : " + cnt);
        }
    }

    // ---------------- DISTINCT ----------------
    static String distinctCharacters(String str) {

        String[] trace = new String[str.length()];
        int iNdx = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = str.charAt(i) + "";

            boolean found = false;
            for (int j = 0; j < iNdx; j++) {
                if (trace[j].equals(ch)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                trace[iNdx++] = ch;
                result += ch;
            }
        }
        return result;
    }

    // ---------------- UNIQUE ----------------
    static String uniqueCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    cnt++;
            }

            if (cnt == 1)
                result += ch;
        }
        return result;
    }

    // ---------------- DUPLICATE ----------------
    static String duplicateCharacters(String str) {

        String[] trace = new String[str.length()];
        int iNdx = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = str.charAt(i) + "";

            boolean found = false;
            for (int j = 0; j < iNdx; j++) {
                if (trace[j].equals(ch)) {
                    found = true;
                    break;
                }
            }

            if (found)
                continue;

            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) + "").equals(ch))
                    cnt++;
            }

            trace[iNdx++] = ch;

            if (cnt > 1)
                result += ch;
        }
        return result;
    }

    // ---------------- HIGHEST ----------------
    static char highestRepeating(String str) {

        char res = ' ';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    cnt++;
            }

            if (cnt > max) {
                max = cnt;
                res = ch;
            }
        }
        return res;
    }

    // ---------------- LOWEST ----------------
    static char lowestRepeating(String str) {

        char res = ' ';
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int cnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    cnt++;
            }

            if (cnt < min) {
                min = cnt;
                res = ch;
            }
        }
        return res;
    }
}

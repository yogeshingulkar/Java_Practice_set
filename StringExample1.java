import java.util.Arrays;

public class StringExample1 {

    public static void main(String[] args) {

        String str = "hippopotammmus";
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println();

        frequencyOfCharacters(arr, arr.length);
        System.out.println();

        String distinct = distinctCharacters(arr, arr.length);
        System.out.println("Distinct : " + distinct);

        String uni = uniqueCharacters(arr, arr.length);
        System.out.println("UNI : " + uni);

        String dup = duplicateCharacters(arr, arr.length);
        System.out.println("Duplicate : " + dup);

        char highestRepChr = highestRepeatingCharacters(arr, arr.length);
        System.out.println("1st Highest repeating : " + highestRepChr);

        char lowestRepChr = lowestRepeatingCharacters(arr, arr.length);
        System.out.println("1st Lowest repeating : " + lowestRepChr);

        char sndHighestRepChr = secondHighestRepeatingCharacters(arr, arr.length);
        System.out.println("2nd Highest repeating : " + sndHighestRepChr);

        char sndLowestRepChr = sndLowestRepeatingCharacters(arr, arr.length);
        System.out.println("2nd Lowest repeating : " + sndLowestRepChr);
    }

    private static char sndLowestRepeatingCharacters(char[] arr, int n) {
        char ch1 = ' ', ch2 = ' ';
        int min1 = Integer.MAX_VALUE, min2 = min1;
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (min1 > cnt) {
                min2 = min1;
                ch2 = ch1;
                min1 = cnt;
                ch1 = arr[i];
            } else if (min2 > cnt && cnt != min1) {
                min2 = cnt;
                ch2 = arr[i];
            }
        }
        return ch2;
    }

    private static char secondHighestRepeatingCharacters(char[] arr, int n) {
        char ch1 = ' ', ch2 = ' ';
        int max1 = Integer.MIN_VALUE, max2 = max1;
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (max1 < cnt) {
                max2 = max1;
                ch2 = ch1;
                max1 = cnt;
                ch1 = arr[i];
            } else if (max2 < cnt && cnt != max1) {
                max2 = cnt;
                ch2 = arr[i];
            }
        }
        return ch2;
    }

    private static char lowestRepeatingCharacters(char[] arr, int n) {
        char ch = ' ';
        int min = Integer.MAX_VALUE;
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (min > cnt) {
                min = cnt;
                ch = arr[i];
            }
        }
        return ch;
    }

    private static char highestRepeatingCharacters(char[] arr, int n) {
        char ch = ' ';
        int max = Integer.MIN_VALUE;
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (max < cnt) {
                max = cnt;
                ch = arr[i];
            }
        }
        return ch;
    }

    private static String duplicateCharacters(char[] arr, int n) {
        String str = "";
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (cnt > 1)
                str += arr[i];
        }
        return str;
    }

    private static String uniqueCharacters(char[] arr, int n) {
        String str = "";
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }

            if (cnt == 1)
                str += arr[i];
        }
        return str;
    }

    private static String distinctCharacters(char[] arr, int n) {
        String str = "";
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    t[j] = true;
                }
            }
            str += arr[i];
        }
        return str;
    }

    private static void frequencyOfCharacters(char[] arr, int n) {
        boolean[] t = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (t[i]) continue;

            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    t[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }
    }
}

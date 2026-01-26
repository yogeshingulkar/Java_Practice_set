import java.util.Scanner;

class Program100 {

    public static String rollingString(String s, String[] operations) {

        char[] arr = s.toCharArray();

        for (String op : operations) {

            String[] parts = op.split(" ");
            int i = Integer.parseInt(parts[0]);
            int j = Integer.parseInt(parts[1]);
            char dir = parts[2].charAt(0);

            for (int k = i; k <= j; k++) {

                if (dir == 'R') {
                    if (arr[k] == 'z') {
                        arr[k] = 'a';
                    } else {
                        arr[k]++;
                    }
                } else { // 'L'
                    if (arr[k] == 'a') {
                        arr[k] = 'z';
                    } else {
                        arr[k]--;
                    }
                }
            }
        }

        return new String(arr);
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();      // initial string
        int n = Integer.parseInt(sc.nextLine()); // number of operations

        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        String result = rollingString(s, operations);
        System.out.println(result);
    }
}

import java.util.Scanner;

class Program101 {

    // Check if a number has all unique digits
    private static boolean hasUniqueDigits(int num) {
        boolean[] seen = new boolean[10];

        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            num /= 10;
        }
        return true;
    }

    // Function as described in the problem
    public static void countNumbers(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            int count = 0;

            for (int num = start; num <= end; num++) {
                if (hasUniqueDigits(num)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // number of ranges
        int[][] arr = new int[q][2];

        for (int i = 0; i < q; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        countNumbers(arr);
    }
}

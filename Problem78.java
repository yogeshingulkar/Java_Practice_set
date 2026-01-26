import java.util.Scanner;

class Problem78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!(sc.hasNextLine())) {
            System.out.print(0);
            return;
        }

        String dataStream = sc.nextLine();
        System.out.println("Enter a characters : ");
        int n = dataStream.length();

        if (n == 0) {
            System.out.print(0);
            return;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (dataStream.charAt(i) == dataStream.charAt(n - 1 - i)) {
                count++;
            }
        }

        System.out.print(count);
    }
}

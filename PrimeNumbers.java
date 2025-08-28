import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        System.out.print("Prime numbers between " + start + " and " + end + ": ");
        printPrimes(start, end);
    }

    public static void printPrimes(int current, int end) {
        if (current > end) return;
        if (isPrime(current, 2)) System.out.print(current + " ");
        printPrimes(current + 1, end);
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i > Math.sqrt(n)) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }
}

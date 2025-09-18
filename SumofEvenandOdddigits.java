public class SumofEvenandOdddigits {
    public static void main(String[] args) {
        int num = 23403; // Example number
        int evenSum = 0, oddSum = 0;

        // Calculate the sum of even and odd digits
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            if (digit % 2 == 0) {
                evenSum += digit; // Add to even sum
            } else {
                oddSum += digit; // Add to odd sum
            }
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

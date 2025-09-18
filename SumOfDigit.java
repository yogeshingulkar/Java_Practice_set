class SumOfDigit {
    public static void main(String[] args) {

        int num = 12345; // Example number
        int sum = 0;

        // Calculate the sum of digits
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt(); // Example number to check
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; //orginal number to compare later
        int reversedNumber = 0; //variable to store the reversed number

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; //Append digit
            number /= 10; //remove the last digit from number
        }

        return originalNumber == reversedNumber; // Compare original and reversed numbers
    }
}

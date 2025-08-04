// 5. Compound Value Savings
// Question:
// Write a program that prompts the user to enter the monthly saving amount and displays the account value after the sixth month.

// Assume the annual interest rate is 5%.

import java.util.Scanner;

 class CompoundSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double monthlyRate = 0.05 / 12;
        double total = 0;

        for (int i = 0; i < 6; i++) {
            total = (saving + total) * (1 + monthlyRate);
        }

        System.out.printf("After the sixth month, the account value is Rs - %.2f\n", total);
    }
}

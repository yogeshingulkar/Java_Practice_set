// 6. Monthly Interest
// Question:
// Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.

// Formula: interest = balance × (annualInterestRate / 1200)

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter interest rate (e.g., 3 for 3%): ");
        double rate = input.nextDouble();
        double interest = balance * (rate / 1200);
        System.out.println("The interest is " + interest);
    }
}

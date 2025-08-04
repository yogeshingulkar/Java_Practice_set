// 3. Number of Years from Minutes
// Question:
// Write a program that prompts the user to enter the number of minutes and displays the number of years and days for the given minutes.

// (1 year = 365 days)

import java.util.Scanner;

 class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long years = minutes / (60 * 24 * 365);
        long days = (minutes / (60 * 24)) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

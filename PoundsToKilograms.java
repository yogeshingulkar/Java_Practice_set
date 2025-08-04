// 1. Pounds to Kilograms
// Question:
// Write a program that converts pounds into kilograms.
// The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.

// (Note: 1 pound is 0.454 kilograms.)

import java.util.Scanner;

 class PoundsToKilograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}

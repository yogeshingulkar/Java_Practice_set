// 4. Energy Needed to Heat Water
// Question:
// Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.

// The formula is: Q = M × (finalTemperature – initialTemperature) × 4184
// where M is the weight of water in kilograms.

import java.util.Scanner;

class EnergyCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double m = input.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        double t1 = input.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        double t2 = input.nextDouble();
        double q = m * (t2 - t1) * 4184;
        
        System.out.println("The energy needed is " + q);
    }
}

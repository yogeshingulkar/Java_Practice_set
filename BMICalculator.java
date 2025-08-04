
// 7. Body Mass Index (BMI)
// Question:
// Write a program that calculates and displays the BMI (Body Mass Index).

// BMI = weightInKilograms / (heightInMeters × heightInMeters)
// 1 pound = 0.45359237 kg
// 1 inch = 0.0254 m

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / (meters * meters);
        System.out.println("BMI is " + bmi);
    }
}

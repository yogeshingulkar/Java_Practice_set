// 9. Cost of Driving
// Question:
// Write a program that calculates the cost of driving based on driving distance, fuel efficiency, and cost per gallon.


import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();
        double cost = (distance / mpg) * price;
        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}

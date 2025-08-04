// 2. Calculate Tips
// Question:
// Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.

// (Gratuity = subtotal × gratuity rate / 100)

import java.util.Scanner;

 class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        double rate = input.nextDouble();

        double tip = subtotal * rate / 100;
        double total = subtotal + tip;
      
        System.out.println("The tip is " + tip + " and total is " + total);
    }
}

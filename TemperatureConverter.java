import java.util.Scanner;

public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //infinite loop - for n number of execution
        for (;;) {
            System.out.println();
            System.out.println("      WELCOME USER   ");
            System.out.println("Convert to Celsius from:");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");
            System.out.println("3. Rankine");
            System.out.println("4. Reaumur");
            System.out.println("5. Delisle");
            System.out.println("6. Newton");

            System.out.print("Enter your scale 1 to 6: ");
            int scale = sc.nextInt();

            if (scale < 1 || scale > 6) {
                System.out.println("Invalid Scale Entered.. Please Check Scale Range");
                return;
            }

            System.out.print("Enter the temperature value: ");
            double tempValue = sc.nextDouble();

            double celsius = 0.0;

            if (scale == 1) {
                celsius = (tempValue - 32) * 5 / 9; // Fahrenheit to Celsius
            } else if (scale == 2) {
                celsius = tempValue - 273.15; // Kelvin to Celsius
            } else if (scale == 3) {
                celsius = (tempValue - 491.67) * 5 / 9; // Rankine to Celsius
            } else if (scale == 4) {
                celsius = tempValue * 1.25; // Reaumur to Celsius
            } else if (scale == 5) {
                celsius = 100 - tempValue * 2 / 3; // Delisle to Celsius
            } else {
                celsius = tempValue * 100 / 33; // Newton to Celsius
            }

            System.out.println("Temperature in Celsius: " + celsius + "°C");
        }
    }
}

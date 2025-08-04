// 2 Question:
// Write a Java program to calculate the average speed in kilometers per hour.

// A runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.

// Assume that 1 mile is equal to 1.6 kilometers.

// Calculate and display the average speed in kilometers per hour (km/h).

public class AverageSpeed {
    
    public static void main(String[] args) {
        // Distance in miles
        double miles = 24;

        // Convert miles to kilometers
        double kilometers = miles * 1.6;

        // Time: 1 hour, 40 minutes, and 35 seconds
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        // Convert time to hours
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Calculate average speed in km/h
        double averageSpeed = kilometers / totalTimeInHours;

        // Display the result
        System.out.println("Average speed in kilometers per hour: " + averageSpeed);
    }
}

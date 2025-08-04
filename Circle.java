import java.util.Scanner;

class Circle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        float radius = sc.nextFloat(); // Corrected here

        final float PI = 3.147f;
        float area = PI * (radius * radius);
        float perimeter = 2 * PI * radius;

        System.out.println("Radius : " + radius + " cm");
        System.out.println("Area : " + area + " cm^2");
        System.out.println("Perimeter : " + perimeter + " cm");

    }
}

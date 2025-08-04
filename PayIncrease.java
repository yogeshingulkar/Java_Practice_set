import java.util.Scanner;

class PayIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter monthly target score: ");
        int target = sc.nextInt();

        if (target > 90) {
            salary += salary * 0.03;
        } else {
            salary += salary * 0.01;
        }

        System.out.println("Updated salary: " + salary);
    }
}
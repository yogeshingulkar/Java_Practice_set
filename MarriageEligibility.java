import java.util.Scanner;

class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your property value: ");
        double property = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();

        if (age >= 21 && (property > 10000000 || surname.equalsIgnoreCase("Ambani"))) {
            System.out.println("You are eligible to marry your girlfriend.");
        } else {
            System.out.println("You are NOT eligible to marry your girlfriend.");
        }
    }
}

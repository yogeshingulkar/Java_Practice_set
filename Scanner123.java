import java.util.Scanner;

class Scanner123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String str1 = sc.nextLine();

        System.out.print("Enter Your Email : ");
        String str2 = sc.next();

        System.out.print("Enter Your Contact Number : ");
        long str3 = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Your Address : ");
        String str4 = sc.nextLine();

        System.out.print("Enter Your Degree : ");
        String str5 = sc.nextLine();

        System.out.print("Enter Your Branch : ");
        String str6 = sc.nextLine();

        System.out.print("Enter Your Year Of Passing : ");
        short str7 = sc.nextShort();

        System.out.print("Enter Your CGPA : ");
        double str8 = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name            : " + str1);
        System.out.println("Email           : " + str2);
        System.out.println("Contact Number  : " + str3);
        System.out.println("Address         : " + str4);
        System.out.println("Degree          : " + str5);
        System.out.println("Branch          : " + str6);
        System.out.println("Year Of Passing : " + str7);
        System.out.println("CGPA            : " + str8);
    }
}
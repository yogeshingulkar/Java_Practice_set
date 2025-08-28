import java.util.Scanner;
class ApplicationDriver 
{
    static String mypin = System.getenv("mypin"); // null if not set in environment

    //static block starts
    static {
        Scanner sc = new Scanner(System.in);
        boolean assumpt = false;

        for (int i = 3; i >= 1; i--) {
            System.out.print("Enter your pin : ");
            String pin = sc.next();

            if (pin.equals(mypin)) {
                assumpt = true;
                break;
            } else {
                System.out.println("Invalid Pin");
                System.out.println("Attempt left : " + (i - 1));
            }
        }

        if (!assumpt) {
            System.exit(0); // terminate the JVM (KILLS A THREAD)
        }
    }

    public static void main(String[] args) {
        launchApplication();
    }

    public static void launchApplication() {
        System.out.println();
        System.out.println("PhonePay\nHOME PAGE");
    }
}

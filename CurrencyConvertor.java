import java.util.Scanner;
class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // infinite loop
        for (; ; ) {
            System.out.println();
            System.out.println("       WELCOME ");
            System.out.println("List of Currency");
            System.out.println("1. USD - US Dollar");
            System.out.println("2. EUR - Euro");
            System.out.println("3. GBP - British Pound");
            System.out.println("4. JPY - Japanese Yen");
            System.out.println("5. AUD - Australian Dollar");
            System.out.println("6. CAD - Canadian Dollar");
            System.out.println("7. CNY - Chinese Yuan");
            System.out.println("8. SGD - Singapore Dollar");
            System.out.println("9. CHF - Swiss Franc");
            System.out.println("FOR EXIT ENTER 0");
            System.out.println();

            System.out.print("Enter your Amount in INR: ");
            float inr = sc.nextFloat();

            System.out.print("Enter the Currency Code: ");
            String code = sc.next().toUpperCase();
            boolean asump = true;

            float con = 0;

            if (code.equals("USD")) {
                con = inr / 85.5950f;
            } else if (code.equals("EUR")) {
                con = inr / 100.427f;
            } else if (code.equals("GBP")) {
                con = inr / 110.75f;
            } else if (code.equals("JPY")) {
                con = inr / 0.58f;
            } else if (code.equals("AUD")) {
                con = inr / 56.30f;
            } else if (code.equals("CAD")) {
                con = inr / 63.85f;
            } else if (code.equals("CNY")) {
                con = inr / 11.90f;
            } else if (code.equals("SGD")) {
                con = inr / 63.25f;
            } else if (code.equals("CHF")) {
                con = inr / 95.70f;
            } else if (code.equals("0")) {
                System.out.println();
                System.out.println("THANK U VISIT AGAIN");
                return;
            } else {
                System.out.println();
                System.out.println("INVALID Currency COde i.e : " + code);
                asump = false;
            }

            if (asump) {
                System.out.println(inr + " INR : " + con + " " + code);
            }
        }
    }
}

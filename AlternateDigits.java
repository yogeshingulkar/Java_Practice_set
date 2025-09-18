class AlternateDigits {
    public static void main(String[] args) {
        int n = 123456;
        String str = Integer.toString(n);
        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            if ((digit - '0') % 2 == 0) {
                evenDigits.append(digit);
            } else {
                oddDigits.append(digit);
            }
        }

        System.out.println("Even digits: " + evenDigits);
        System.out.println("Odd digits: " + oddDigits);
    }
}
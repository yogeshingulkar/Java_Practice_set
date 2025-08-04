public class ForLoopExamples {
    public static void main(String[] args) {

        // 1. 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------");

        // 2. 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 3. Even numbers from 1 to 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 4. Odd numbers from 1 to 100
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("---------------");
        System.out.println("---------------");

        // 5. A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 6. a to z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("---------------");
        System.out.println();

        // 7. 0 to 9
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 8. A-Z, a-z, 0-9
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("---------------");
        System.out.println();

        // 9. Only Special Characters
        for (char ch = 33; ch <= 47; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = 58; ch <= 64; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = 91; ch <= 96; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = 123; ch <= 126; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("---------------");
        System.out.println();

        //Or Only Special Characters
        for (char ch=0;ch<=127 ;ch++ ) {
            if((ch>='A' && ch<=))
            
        }

        // 10. z to a
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 11. ASCII characters (A-Z)
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " : " + (int) ch);
        }
        System.out.println();
        System.out.println("---------------");

        // 12. ASCII characters (a-z)
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " : " + (int) ch);
        }
        System.out.println();
        System.out.println("---------------");

        // 13. Alternate Alphabets A C E G ...
        for (char ch = 'A'; ch <= 'Z'; ch += 2) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("---------------");

        // 14. A C F J O U pattern
        for (char ch = 'A'; ch <= 'Z'; ) {
            System.out.print(ch + " ");
            if (ch == 'A') ch += 2;
            else if (ch == 'C') ch += 3;
            else if (ch == 'F') ch += 4;
            else if (ch == 'J') ch += 5;
            else if (ch == 'O') ch += 6;
            else break;
        }
        System.out.println();
        System.out.println("---------------");

        // 15. Vowels using Switch Expression (Java 14+)(->)
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U' -> System.out.print(ch + " ");
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.print(ch + " ");
            }
        }
    }
}

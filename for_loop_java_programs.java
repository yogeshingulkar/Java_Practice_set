public class ForLoopExamples {
    public static void main(String[] args) {

        // 1. Numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");

        // 2. Numbers from 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");

        // 3. Even numbers from 1 to 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");

        // 4. Odd numbers from 1 to 100
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");

        // 5. A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("\n-----------------------------");

        // 6. a to z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("\n-----------------------------");

        // 7. Z to A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("\n-----------------------------");

        // 8. ASCII values A-Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }
        System.out.println("-----------------------------");

        // 9. 0-9
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("\n-----------------------------");

        // 10. Special Characters
        for (char ch = 32; ch <= 126; ch++) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println("\n-----------------------------");

        // 11. Right-Angled Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 12. Pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 13. Inverted Triangle
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 14. Repeating Row Numbers
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 15. Repeating Column Numbers
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 16. Alphabet Triangle
        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 17. Repeating Alphabets
        for (char i = 'A'; i <= 'C'; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 18. Diagonal Pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) System.out.print("^ ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 19. Reverse Diagonal
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j == 6) System.out.print("^ ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 20. X Pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) System.out.print("^ ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

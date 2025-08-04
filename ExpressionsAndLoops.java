 class ExpressionsAndLoops {
    public static void main(String[] args) {
        int a = 5;
        int res1 = a++ + ++a; // 1
        System.out.println("res1: " + res1);

        a = 5;
        int res2 = --a + a--; // 2
        System.out.println("res2: " + res2);

        for (int i = 0; i < 3; i++) { // 3
            System.out.println("Loop i: " + i);
        }

        for (int i = 0; i < 3;) {
            System.out.println("Pre-increment i: " + ++i); // 4
        }

        int counter = 3;
        while (counter-- > 0) { // 5
            System.out.println("Countdown: " + counter);
        }

        int x = 1;
        int y = x++ + x++ + ++x; // 6
        System.out.println("y = " + y);

        int val = 3;
        System.out.println("val++: " + val++); // 7
        System.out.println("Now val: " + val);

        int p = 4;
        int q = ++p + --p + p++; // 8
        System.out.println("q = " + q);

        int i = 10;
        int j = (i++ > 10) ? ++i : --i; // 9
        System.out.println("Ternary result j = " + j);

        int n = 0;
        while (n++ < 2) { // 10
            System.out.println("n = " + n);
        }

        int z = 5;
        z += ++z + z--; // 11
        System.out.println("z = " + z);

        int r = 2;
        r = r++ + r++ + r; // 12
        System.out.println("r = " + r);

        int s = 1;
        int t = ++s + s++ + --s; // 13
        System.out.println("t = " + t);

        // 14: Boolean while loop
        boolean active = true;
        int loop = 0;
        while (active) {
            System.out.println("active loop " + loop++);
            if (loop == 3) active = false;
        }

        // 15: Combined
        int combo = 1;
        combo = ++combo + combo++ + combo--; // 15
        System.out.println("combo = " + combo);
    }
}
 
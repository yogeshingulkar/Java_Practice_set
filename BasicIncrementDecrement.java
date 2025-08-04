class BasicIncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        a++; // 1
         System.out.println("a++ = " + a);

        int b = 2;
        ++b; // 2
        System.out.println("++b = " + b);

        int c = 3;
        c--; // 3
        System.out.println("c-- = " + c);

        int d = 4;
        --d; // 4
        System.out.println("--d = " + d);

        int e = 5;
        int f = e++; // 5
        System.out.println("f = e++ → f = " + f + ", e = " + e);

        int g = 6;
        int h = ++g; // 6
        System.out.println("h = ++g → h = " + h + ", g = " + g);

        int x = 10;
        System.out.println("Before x++: " + x); // 7
        x++;
        System.out.println("After x++: " + x);

        int y = 15;
        y--;
        System.out.println("y-- = " + y); // 8

        int m = 3;
        System.out.println("Using ++ in print: " + ++m); // 9

        int n = 7;
        System.out.println("Using n++ in print: " + n++); // 10
        System.out.println("After print, n: " + n);

        int k = 0;
        k = ++k + k++; // 11
        System.out.println("k = " + k);

        int u = 2;
        int v = u++ + ++u; // 12
        System.out.println("u++ + ++u = " + v);

        int z = 5;
        int res = z-- - --z; // 13
        System.out.println("z-- - --z = " + res);

        int w = 10;
        System.out.println("Before reset: " + w);
        w = w++ + w-- - w; // 14
        System.out.println("After reset expression: " + w);

        // 15: Boolean loop
        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Loop count: " + count);
            count++;
            if (count == 3) flag = false;
        }
    }
}
 
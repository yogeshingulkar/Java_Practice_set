class AdvancedIncrement 
{
    public static void main(String[] args) 
    {
        int i = 1;
        int result = i++ + i++ + ++i + --i + i-- + i++; // 1
        System.out.println("Tricky result: " + result);

        int x = 5;
        System.out.println("addOne(x++): " + addOne(x++)); // 2

        int a = 3;
        int b = (a++ > 2) ? ++a : --a; // 3
        System.out.println("b = " + b);

        a = 0;
        a = ++a + a++; // 4
        System.out.println("a = " + a);

        print(++a); // 5

        int m = 2;
        int n = m++ * --m + ++m; // 6
        System.out.println("n = " + n);

        int z = 10;
        z = z++ + z++ + --z + ++z; // 7
        System.out.println("z = " + z);

        int p = 5;
        int q = --p + p++ + ++p + p--; // 8
        System.out.println("q = " + q);

        int temp = 1;
        temp = temp++ + ++temp + temp-- + --temp; // 9
        System.out.println("temp = " + temp);

        int value = 100;
        value += ++value + value++; // 10
        System.out.println("value = " + value);

        int flag = 0;
        if (flag++ == 0) { // 11
            System.out.println("Condition true with flag = " + flag);
        }

        // 12: Multiple flags
        int f1 = 1, f2 = 2, f3;
        f3 = ++f1 + f2-- + f1++; // 12
        System.out.println("f3 = " + f3);

        // 13: Chain assignment
        int r = 1;
        r = r++ + r++ + ++r; // 13
        System.out.println("r = " + r);

        // 14: Compound + ternary
        int val = 4;
        int output = (val++ > 3) ? ++val : val--; // 14
        System.out.println("output = " + output);

        // 15: Boolean loop
        boolean loop = true;
        int loopVar = 0;
        while (loop) {
            System.out.println("LoopVar: " + loopVar++);
            if (loopVar == 3) loop = false;
        }
    }

    public static int addOne(int x) {
        return x + 1;
    }

    public static void print(int val) {
        System.out.println("Printed: " + val);
    }
}
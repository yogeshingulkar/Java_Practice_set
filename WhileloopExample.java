class WhileloopExample {
public static void main(String[] args) {
	// 1 to 100
int i = 1;
while (i <= 100) {
    System.out.print(i + " ");
    i++;
}
System.out.println("---------------");

// 100 to 1
i = 100;
while (i >= 1) {
    System.out.print(i + " ");
    i--;
}
System.out.println("---------------");

// 1 to 100 - Even Numbers
i = 1;
while (i <= 100) {
    if (i % 2 == 0) System.out.print(i + " ");
    i++;
}
System.out.println("---------------");

// 1 to 100 - Odd Numbers
i = 1;
while (i <= 100) {
    if (i % 2 != 0) System.out.print(i + " ");
    i++;
}
System.out.println("---------------");

// A to Z
char ch = 'A';
while (ch <= 'Z') {
    System.out.print(ch + " ");
    ch++;
}
System.out.println("---------------");

// a to z
ch = 'a';
while (ch <= 'z') {
    System.out.print(ch + " ");
    ch++;
}
System.out.println("---------------");

// 0 to 9
i = 0;
while (i <= 9) {
    System.out.print(i + " ");
    i++;
}
System.out.println("---------------");

// A-Z, a-z, 0-9
ch = 'A';
while (ch <= 'Z') {
    System.out.print(ch + " ");
    ch++;
}
ch = 'a';
while (ch <= 'z') {
    System.out.print(ch + " ");
    ch++;
}
i = 0;
while (i <= 9) {
    System.out.print(i + " ");
    i++;
}
System.out.println("---------------");

// Only Special Characters (ASCII 33 to 47 as sample)
i = 33;
while (i <= 47) {
    System.out.print((char)i + " ");
    i++;
}
System.out.println("---------------");

// Print z to a
ch = 'z';
while (ch >= 'a') {
    System.out.print(ch + " ");
    ch--;
}
System.out.println("---------------");

// ASCII CHARACTER WITH ASCII VALUE (A-Z)
ch = 'A';
while (ch <= 'Z') {
    System.out.println(ch + " -> " + (int)ch);
    ch++;
}
System.out.println("---------------");

// ASCII CHARACTER WITH ASCII VALUE (a-z)
ch = 'a';
while (ch <= 'z') {
    System.out.println(ch + " -> " + (int)ch);
    ch++;
}
System.out.println("---------------");

// Alternate Alphabets - A C E G I K ...
ch = 'A';
while (ch <= 'Z') {
    System.out.print(ch + " ");
    ch += 2;
}
System.out.println("---------------");

// A C F J O U
ch = 'A';
while (ch <= 'Z') {
    if (ch == 'A' || ch == 'C' || ch == 'F' || ch == 'J' || ch == 'O' || ch == 'U') {
        System.out.print(ch + " ");
    }
    ch++;
}
System.out.println("---------------");

// Vowels from Uppercase and Lowercase using Switch Expression
ch = 'A';
while (ch <= 'Z') {
    switch (ch) {
        case 'A', 'E', 'I', 'O', 'U' -> System.out.print(ch + " ");
    }
    ch++;
}
ch = 'a';
while (ch <= 'z') {
    switch (ch) {
        case 'a', 'e', 'i', 'o', 'u' -> System.out.print(ch + " ");
    }
    ch++;
}
System.out.println("---------------");

}
}
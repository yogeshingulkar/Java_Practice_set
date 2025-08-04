class ForLoops {
    public static void main(String[] args) {

        // Uppercase A-Z
        for (char ch = 65; ch <= 90; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("\n-----------------");

        // Lowercase a-z
        for (char ch = 97; ch <= 122; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("\n-----------------");

        // Digits 0-9
        for (char ch = 48; ch <= 57; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("\n-----------------");

        // 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n-----------------");

        // 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // 0 to 127
        for (int i = 0; i <= 127; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // A-Z a-z 0-9
        for (char ch = 0; ch <= 127; ch++) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------");

        // Z to A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // Only special characters (non-alphanumeric)
        for (char ch = 0; ch <= 127; ch++) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------");

        // Character with ASCII values A-Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " : " + (int) ch + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // Character with ASCII values a-z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " : " + (int) ch + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // Character with ASCII values 0-9
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.print(ch + " : " + (int) ch + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // Pattern: A C E G I K ...
        for (char ch = 'A'; ch <= 'Z'; ch += 2) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // Pattern: A C F J O U
        char step = 1;
        for (char ch = 'A'; ch <= 'Z'; ch+=step) {
            System.out.print(ch + " ");
            step++;
        }

        System.out.println();

        System.out.println("-----------------");

// 1 to 100
for(int num=1; num<=100;num++){
System.out.print(num + " ");
}
System.out.println();
System.out.println("----------------");
System.out.println("----------------");
System.out.println("----------------");

// 100 to 1
for(int number=100; number>=1; number--){
System.out.print(number + " ");
}


//1 to 100- Even Number
//1 to 100 - Odd Number
// A to Z 
// a to z
// 0 to 9 
// A-Z, a-z, 0-9 
//Only Special Characters
for(char ch =0; ch<=127; ch++){
if(!((ch>='A' && ch<='Z' )|| (ch>='a' && ch<='z') || (ch>=48 && ch<=57)))
System.out.print( ch+" ");
}

//print z-a
//ASCII CHARACTER WITH ASCII VALUE(A-Z)
//ASCII CHARACTER WITH ASCII VALUE(a-z)
//Alternate Alphabets - ACEGIK.....
//A C F J O U 
//find Vowels from Uppercase and Lowercase ALphabet - Switch Expression (->) Vowels

    }
}

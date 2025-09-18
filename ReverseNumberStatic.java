import java.util.Scanner;
class ReverseNumberStatic {
    
    static {

        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); //123
        
        System.out.println("ORIGINAL NUMBER : " + num);
        int rev = reverse(num); //123
        System.out.println("REVERSED NUMBER : " + rev);
    
        System.exit(0);
    }

    public static int reverse(int num) {
        
        while (num != 0) 
        {
        int rev = 0;
            int rem = num % 10;
            rev = rev * 10 + rem; 
           	num /= 10;
        }

        return rev;
    }

   
}

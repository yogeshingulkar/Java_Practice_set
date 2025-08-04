import java.util.Scanner ;
class ReverseNumber
 {
   public static void main (String [] args ) 
   {
   	    Scanner sc = new Scanner ( System.in) ;
   	    System.out.print("Enter a number : ") ;
   	    int num = sc.nextInt(), dup = num, rev = 0;

   	    int rem = num % 10 ;
   	    rev = rev * 10 + rem ;
   	    num /= 10 ;

   	    rem = num % 10 ;
   	    rev = rev * 10 + rem ;
   	    num /= 10 ;

   	    rem = num % 10 ;
   	    rev = rev * 10 + rem ;
   	    num /= 10 ;

   	    rem = num % 10 ;
        rev = rev * 10 + rem ;
        num /= 10 ;

        
   	    System.out.println("num : " + dup);
   	    System.out.println("rev : " + rev);
  }
	
}
import java.util.Scanner;
class CheckPalindrome
{
		
		static int num; //0
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();

	if(isPalindromeNumber())
	{
		System.out.println(num + " is Palindrome");
	}
	else
	{
		System.out.println(num+ " is Not Palindrome");
		}
	}
public static boolean isPalindromeNumber(){ //boolean because - it return always true/false

		int dup = num ;
		int rev = 0;

		while(dup!=0){ 				 // dup>0
		int rem = dup % 10 ; 		//to fetch the last number
		rev = rev *10 + rem; 		//to add the last number into 
		dup /= 10 ; 				// to remove the last digit of Original num
}
		if(num==rev)
			return true; //if num is simillar to the reverse number
		else
			return false; //if num is not simillar to the reverse number

}
}
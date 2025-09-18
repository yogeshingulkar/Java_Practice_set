import java.util.Scanner;
class ReverseNumber
{	static int  num;
	static int rev ;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" enter the number : ");
		num = sc.nextInt();
		
		int dup = num;
		ReverseNumbers(num);
		
		System.out.println(dup + " : "  + rev);
		
	}
	
	
	public static void ReverseNumbers( int num )
	{
		
		rev = rev * 10 + (num %10);
		num /= 10;
		
		if(num == 0) return ;
		
		ReverseNumbers(num);
		
		
	}
	
	
	
}
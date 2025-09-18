import java.util.Scanner;
class SumOfDemoG
{
	static int num,dup,sum;

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : " );
		 num = sc.nextInt();
		dup = num;
	        SumOfDigits();
		
		System.out.println( dup + " : " + sum);
	
	}
		
	public static void SumOfDigits()
	{
		sum += num % 10;
		num /= 10;
		
		if(num == 0) return ;
			
		SumOfDigits();
	}

}




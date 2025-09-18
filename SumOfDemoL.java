import java.util.Scanner;
class SumOfDemoL
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : " );
		int num = sc.nextInt();
		int dup = num;
		int op = SumOfDigits(num,0);
		
		System.out.println( " Sum of digits is : " + op);
	
	}
		
	public static int  SumOfDigits(int num , int sum)
	{
		sum += num % 10;
		num /= 10;
		
		if(num == 0) return sum;
			
		return SumOfDigits(num ,sum);
	}

}




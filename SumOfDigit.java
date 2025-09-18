import java.util.Scanner;
class SumOfDigit
{
	static int num;
	static int sum;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : " );
		num = sc.nextInt();
		int dup = num;
		SumOfDigits(num);
		
		System.out.println(dup + " : " + sum);
	
	}
		
	public static void SumOfDigits(int num)
	{
		sum += num % 10;
		num /= 10;
		
		if(num == 0) return;
			
		SumOfDigits(num);
	}

}




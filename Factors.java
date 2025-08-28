import java.util.Scanner;
class Factors
{	static int  num;
	static int fact = 1 ;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" enter the number : ");
		num = sc.nextInt();
		
		
		factorsOfNumbers(num);
		
				
	}
	
	
	public static void factorsOfNumbers( int num )
	{
		
		if(num % fact == 0 )
		{
			System.out.println(fact);
		}
		fact ++;
		if(fact == num) return;
		  factorsOfNumbers(num);
		
		
	}
	
	
	
}
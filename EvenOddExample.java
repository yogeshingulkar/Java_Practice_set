
class EvenOddExample
{
		static int  num;
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(" Enter the number  : ");
		 num = sc.nextInt();

		if(checkNumber())
		{
			if(num % 2 == 0)
			{
				System.out.println(num + " is even ");

			}
		}
		else
		{
			System.out.println(num + " is odd ");

		}	
		
	}
			
	
	public static boolean checkNumber()
	{
		if(num >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
}
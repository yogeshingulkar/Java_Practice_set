class PrintNumbers
{
	public static void main(String [] args)
	{
		PrintNumber(1);
	}
	
	public static void PrintNumber(int num)
	{
		System.out.print(num + " ");
		if(num == 100) return;
			
		PrintNumber(++num);
	}
}

class PrintNumbers
{
	public static void main(String [] args)
	{
		PrintNumber();
	}
	
	public static void PrintNumber()
	{
		System.out.print(num + " ");
		if(num++ == 100) return;
			
		PrintNumber();
	}
}
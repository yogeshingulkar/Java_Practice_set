class EvenOdd
{
	public static void main(String [] args)
	{
		System.out.print(" Enter the number : ");
		int num = new java.util.Scanner(System.in).nextInt();
		
		String  op = ( num / 2) * 2 == num ? num + " is even " : num + " is odd "; // without using mod
		String op1 = num / 2 == num / 2.0 ? num + " is even " : num + " is odd ";
		System.out.println(op);
                System.out.println(op1);
	}
}
import java.util.Scanner;
class EvenOddIf
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Hey! User Enter a Number : ");
		int a = sc.nextInt();

		if (a/2*2==a)
		System.out.println("Number is Even");

		if (a/2*2!=a)
		System.out.println("Number is Odd");
}
}
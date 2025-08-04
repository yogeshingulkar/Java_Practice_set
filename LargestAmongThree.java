import java.util.Scanner;
class LargestAmongThree
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" enter the first number : ");
		int num1 = sc.nextInt();

		System.out.print(" enter the first number : ");
		int num2 = sc.nextInt();

		System.out.print(" enter the first number : ");
		int num3 = sc.nextInt();
		
		int op = ( num1 > num2) ? ((num1 > num3) ? num1 : num3) : (num2 > num3 ? num2 : num3);
		
		System.out.println(" Largest Number is : " + op);
	}
}
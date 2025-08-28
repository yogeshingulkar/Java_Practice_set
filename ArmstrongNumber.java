import java.util.Scanner;
class ArmstrongNumber
{
	static int rem ; //0
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		isArmstrong(0); 

	}
	public static void isArmstrong(int n)
	{
		rem = n%10;
		System.out.println(rem);

	}

}
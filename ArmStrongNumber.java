import java.util.Scanner;
class ArmStrongNumber
{
	static int sum ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int originalNum = num ;

		while(num!=0)
		{
			int digit = num%10;
			sum+=(digit*digit*digit);
			num/=10; 		
		}

		if(sum==originalNum){
			System.out.println(originalNum + " : " + " is the Armstrong Number");
		}
		else
			System.out.println(originalNum + " : " + " is Not a Armstrong Number");
		
	}
}
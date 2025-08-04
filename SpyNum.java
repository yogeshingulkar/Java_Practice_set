import java.util.Scanner;
class SpyNum
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int originalNum = num;

		int sum = 0 ;
		int product = 1;

			while(originalNum>0){
				int digit = originalNum % 10 ;
				sum+=digit;
				product *=digit;
				originalNum/=10;
			}

			if(sum==product){
				System.out.println(num + " is Spy Number");
			}else{
				System.out.println(num + " is Not a Spy Number");
			}
	}
}
import java.util.Scanner;
class MethodExample1
{
	static int num ;
	public static void main(String[] args) 
	{
		//check if number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		num = sc.nextInt();

		//if number is valid then block gets exceute
		if(checkNumber())
			{
			if(num%2==0){
				System.out.println(num + " is Even");
			}else{
				System.out.println(num + " is Odd");
			}}
		else{		
				System.out.println("INVALID NUMBER ENTERED : " + num);
			}
	}
		public static boolean checkNumber() {
			if(num<=0){
			 	return false ;
			}
			else{
				return true ;		
			}
	}
}
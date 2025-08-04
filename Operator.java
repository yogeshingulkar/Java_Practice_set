import java.util.Scanner;
class Operator
{
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Number : ");
			int num = sc.nextInt();
			int dup = num ;
			int sum = 0 ;

			int rem = num % 10 ;
			sum = sum + rem ;
			num = num / 10 ;

			rem = num % 10 ;
			sum = sum + rem ;
			num = num / 10 ;

			rem = num % 10 ;
			sum = sum + rem ;
			num = num / 10 ;

			rem = num % 10 ;
			sum = sum + rem ;
			num = num / 10 ;

			System.out.println("Num : " + dup);
			System.out.println("Sum : "+ sum);

		}
}
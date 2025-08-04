import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		if(num>0)
			System.out.println("This is Positive Number");
		if(num<0)
			System.out.println("This is Negative Number");
		if(num==0)
			System.out.println("This is Neutral Number");
	}
}
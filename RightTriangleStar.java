import java.util.Scanner;
class RightTriangleStar
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number of Lines want to Print : ");
		int row = sc.nextInt();

		for (int i=1;i<=row ;i++ ) {              //it works for i 
			for (int j=1;j<=i ;j++ ) {          //it works for j
		
		System.out.print("* ");		//* and some white space
				}		
		System.out.println();   //print function to get the pattern on next line
		}
	}
}
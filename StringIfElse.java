import java.util.Scanner;
class StringIfElse{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();

		if(num%2==0 && num%5!=0){
			System.out.println("Hi Two");
		}

		if(num%5==0 && num%2!=0){
			System.out.println("Hi Two");
		}

		if(num%2==0 && num%5==0){
			System.out.println("HIFiveHiTwo");
		}
	}
}
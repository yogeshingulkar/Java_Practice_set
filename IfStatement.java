import java.util.Scanner;
class IfStatement{
	public static void main(String[] args) {
		
		System.out.println("Shopping Starts");
		System.out.print("Enter Your Bill Amount: ");
		double billAmount = new Scanner(System.in).nextDouble();

		double disc = 15;
		if (billAmount>=5000){

			System.out.println("Congratulations!! You have got" + "% Discount");
			billAmount =(billAmount)-(billAmount/100)*disc;
		}
			System.out.println("Total Bill Amount is : " + billAmount + "rs");
			System.out.println("Shopping Ends");
	}
}
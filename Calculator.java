import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number1 : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter a Number2 : ");
		float num2 = sc.nextFloat();
		System.out.print("Enter a Operator : ");
		char opr = sc.next().charAt(0);
		String op = "";     
    
         op += (opr == '+') ?   
        (op += num1 + num2) : 
        ((opr == '-') ? 
        (op += num1 - num2) : 
        ((opr == '*') ? 
        (op += num1 * num2) : 
        ((opr == '/') ? 
        (op += num1 / num2) : 
        ((opr == '%') ?
        (op += num1 % num2) : 
        (op += "INVALID"))))); //Thats why we use string as a datatype of that variable

        if (op.equals("INVALID")) {
            System.out.println("User you have Entered invalid Operator");
			 	return ;
			 }
			 System.out.println(num1+" "+ opr +" "+ num2+ " = " + op);
	}
}
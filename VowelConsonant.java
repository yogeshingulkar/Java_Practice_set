import java.util.Scanner;
class VowelConsonant
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the  Character :  ");
		char ch = sc.next().toUpperCase().charAt(0);

		String op = ( ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' || ch == 'U') ? " Vowel" : "Consonant" ;
		System.out.println(" The character is : "+ op);
	}
}
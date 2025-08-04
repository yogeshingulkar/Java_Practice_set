import java.util.Scanner;

class CharacterCheck
{
		public static void main(String[] args)
		{

			Scanner input = new Scanner(System.in).next().nextDouble();
			System.out.print("Enter a Character : ");

			char ch = !((ch>='A' && ch<='Z') || 
			          (ch>='a' && ch<='z') || 
			          (ch>='0' && ch<='9'));

			System.out.println(ch);

 		}
}
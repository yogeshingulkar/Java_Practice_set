import java.util.Scanner;

class SpecialCharacters{ 

	public static void main(String[] args) { 
		
        System.out.print("Enter a Character : "); 
		char ch = new Scanner(System.in).next().charAt(1); 

		boolean abc = (ch >= 'A' && ch <= 'Z') ; //Take Alpabets from A-Z (65-90)
		boolean lmn = (ch >= 'a' && ch <= 'z') ; //Take alphabts from a-z (97-122)
		boolean pqr = (ch >= 48 && ch <= 57) ;   //Digits from 0-9 (48-57)
		
        System.out.println("Is this Uppercase : " + abc);
        System.out.println("Is this lowercase : " + lmn);
        System.out.println("Is this Digit : "+pqr);
	}
}
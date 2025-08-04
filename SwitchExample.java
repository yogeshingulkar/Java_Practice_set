import java.util.Scanner;
class SwitchExample
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Hey User Enter a Character: ");
		char ch = sc.next().toUpperCase().charAt(0);

		if(!(ch>='A' && ch<='Z')){
			System.out.println(ch + " This is Number");
			return;
		}

		switch(ch) 
		{
		case 'A': {    
			System.out.println(ch + " This is Vowel");
			break;  		
		}
		case 'B': {							
			System.out.println(ch + " This is Vowel");	
			break;
		} 
		case 'I': {
			System.out.println(ch + " This is Vowel");
			break;
		}
		case 'O': {
			System.out.println(ch + " This is Vowel");
			break;
		}
		case 'U': {
			System.out.println(ch + " This is Vowel");
			break;
		}
		default: {
			System.out.println(ch + " This is Consonant");
			break;
	   	}
	 	}
	}
}
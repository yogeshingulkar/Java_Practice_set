import java.util.Scanner;
class VowelConsonantif{
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an Alphabet : ");
	char ch = sc.next().toLowerCase().charAt(0);

	if((ch>='a' && ch<='z') && !(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'))
		System.out.println("This is Consonant"	);

	if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
		System.out.println("This is Vowel");

}
}
import java.util.Scanner;
class KotakBank{
	static String name;
	static byte age;
	static long contact;
	static char gender;
	public static final long ACCOUNT_NUMBER;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (; ; ) {
			System.out.println();
			System.out.println(" 		WELCOME USER!");
			System.out.println();
			System.out.println("1. Existing User");
			System.out.println("2. Create Account");
			System.out.println();
			System.out.print("Enter an Option : ");
			
			Switch(sc.nextInt()){
				case 1 : {
					System.out.println("");
					if(name==null){
						System.out.println("Create Your Account First");
						continue;
					}
					System.out.println();
					System.out.println(" 		LOGIN");
					System.out.println();
					System.out.println("Validate Phone Number : ");
					long phone = sc.nextLong();
					System.out.println("Validate Account Pin : ");
					int pin1 = sc.nextInt();

						
				}
			}			

			
		}
	}
}
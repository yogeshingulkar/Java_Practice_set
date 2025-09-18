import java.util.scanner;
class ReverseInteger{
	
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numner : ");
		int num = sc.nextInt();

		System.out.println("Original Number : " + num);
		int rev = reverseInteger();
		System.out.println("Reverse Number : " + rev);
		System.exit(0);
			}

			public static int reverseInteger()
			{
				while(num!=0){
				int rev = 0 ;
				
					int rem = num % 10 ;
					rev = rev * 10 + rem ;
					num /= 10 ;

				}
				return rev ;

			}	

}
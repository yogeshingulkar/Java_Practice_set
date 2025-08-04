class Swapping{

	public static void main(String[] args) {
		 
		 int a = 10 ;
		 int b = 30 ;

		 System.out.println("Befor Swapping");
		 System.out.println("A : " + a);
		 System.out.println("B : " + b);

		 a = a + b ; //10 + 30 = 40

		 b = a - b ; //40 - 30 = 10
		 a = a - b ; //40 - 10 = 30
		 
		 System.out.println("After Swapping");
		  System.out.println("A :" + a);
		  System.out.println("B :" + b);

	}
}
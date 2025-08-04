class Operators
{
	public static void main(String[] args) 
	{
		
		int a = 3 ;
		int b = a++; //b becomes 3, And a becomes 4
						//  5     5    3      7     5
		System.out.println(++a + a++ + b++ + ++a + ++b);
						//  4    4   3   5
		// System.out.println(++a + a + b + b++);
						//  4    4   3    4
		// System.out.println(a++ + a + b + b++);
	}
}
class Arithmetic{

//this is a class block 
	//we cannot re-initiallized a variable

	public static void main(String[] args) {
		
		int a = 100 ; //non-static datatype and variable in static method block
		int b = 300 ; //non-static datatype and variable in static method block

		int add = a + b ;
		System.out.println("Addition : " + add); //addition operation

		int sub = a - b ;
		System.out.println("Substraction : " + sub); //substraction operation

		int multiplication = a * b ;
		System.out.println("Multiplication : " + multiplication); //multiplication operation

		int division = a / b ;
		System.out.println("Division : " + division); //division operation

		int module = a % b ;
		System.out.println("Modulus : " + module); //modulus (%)

	}
}
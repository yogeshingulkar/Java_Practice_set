class LabelExample{
public static void main(String[] args)
{

System.out.println("Main method Block Starts");
innerOddBlock:
{
	evenOdd:{
			System.out.println("Even Odd Block Execution Starts");
			if(5%2==0){
			System.out.println("Even");
			break ; evenOdd :
}else{
System.out.println("Odd");
}
			}
}

}}
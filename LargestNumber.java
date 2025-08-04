import java.util.Scanner;

class LargestNumber
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number 1 : ") ;
int a = sc.nextInt();
System.out.print("Enter a Number 2 : ") ;
int b = sc.nextInt();

int largest = a>b ? a : b ;
System.out.println("Largest Number is : " + largest);

}
}
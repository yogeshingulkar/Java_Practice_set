import java.util.Scanner;

class BluePen{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a Blue ink Capacity : ");
int bluePen = sc.nextInt();
System.out.print("Enter a Black ink Capacity : ");
int blackPen = sc.nextInt();

if(bluePen>blackPen){
System.out.println("Blue Pen is Higher Ink : " + bluePen);
} else{
System.out.println("Black Pen is Higher Ink : " + blackPen);
}


}
}
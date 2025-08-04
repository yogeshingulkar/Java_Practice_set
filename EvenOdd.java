import java.util.Scanner;
class EvenOdd {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");    
        int num = new Scanner(System.in).nextInt();
 
        String result = ((num & 1) == 0) ? (" is Even") : (" is Odd");
        System.out.println(num + result);

        //option 01
        // int shrikantSir = (num/2)*2== num ; // 7/2*2==num -> 3*2 -> 6==7
        
        //option 02
        // boolean shrikantSir2 = num/2 ==num/2.0; // 8/2==8/2.0 -> 4==4.0
        System.out.println(shrikantSir);
        System.out.println(shrikantSir2);
    }
}

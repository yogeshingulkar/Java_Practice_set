import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int dup = num;
        int product = 1;

        int rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        System.out.println("Num : " + dup);
        System.out.println("Product : " + product);
    }
}

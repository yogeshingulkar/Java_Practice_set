import java.util.Scanner;
	class Eligibility
	{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter his age: ");
        int age = sc.nextInt();

        System.out.print("Enter his property value: ");
        double property = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter your surname: ");
        String surname = sc.next();
        sc.nextLine();

        if((age>=21) && (property>=10000000 || surname.equals("AMBANI"))){
        	System.out.println("Your are Eligible Buddy!!");

        }else{
        	System.out.println("Your are Rejected Buddy!!");
        }

    }
}
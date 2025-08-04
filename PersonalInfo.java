import java.util.Scanner;
class PersonalInfo
{
    public static void main(String[]args)
    {
	
	System.out.println("Personal Information");
	personalInfo();
	System.out.println("Thankk you giving your information");
    }
    
    public static void personalInfo()
    {   
	 	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
	System.out.print("Enter Your Email : ");
		String email = sc.nextLine();
	System.out.print("Enter Your Phone Number : ");
		long contact = sc.nextLong();
	System.out.print("Enter Your Qaulification : ");
		String education = sc.next();
	System.out.print("Enter Your YOP : ");
		int yop = sc.nextInt();
	System.out.print("Enter the CGPA : ");
		double cgpa = sc.nextDouble();
	
	System.out.println("Name : "+ name);
	System.out.println("Email : "+ email);
	System.out.println("Contact number : "+ contact);
	System.out.println("Qaulification : "+ education);
	System.out.println("Year of passing : "+ yop);
	System.out.println("CGPA : "+ cgpa);
    }
}
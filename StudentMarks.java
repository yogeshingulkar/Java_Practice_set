import java.util.Scanner;
class StudentMarks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Total Marks out of 500 : ");
		double marks = sc.nextInt();
		int totalMarks = 500;

		if ((marks<0) || (marks>totalMarks)){
			System.out.println("Invalid Input type kiya re Bhai" + marks);
			return;
		}
		float percentage = (marks*100)/totalMarks;
			System.out.println("Your obtained "+ marks + "Marks & your Percentage is : "+percentage+"%");

			String grade = "";
		if(percentage>=90){
			grade ="O";
			System.out.print("Outstanding");
		}else if(percentage>=75){
			grade = "A";
			System.out.println("First Class with Dist..");
		}else if(percentage>=60){
			grade = "B";
			System.out.println("First Class");
		}else if(percentage>=50){
			grade = "C";
			System.out.println("Second Class");
		}else if(percentage>=40){
			grade = "D";
			System.out.println("Pass");
		}else if(percentage<=35){
			grade = "F";
			System.out.println("Failed");
		}
		System.out.println("      Grade :"+grade);
	}
}
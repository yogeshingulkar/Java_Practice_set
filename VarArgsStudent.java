import java.util.*;
class VarArgsStudent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Contact : ");
		long contact = sc.nextLong();

		System.out.println("Enter 4 Subject Marks : ");
		System.out.println("Maths : ");
		int maths = sc.nextInt();
		System.out.println("Science : ");
		int science = sc.nextInt();
		System.out.println("geometry : ");
		int geometry = sc.nextInt();
		System.out.println("Algebra : ");
		int algebra = sc.nextInt();

		studentMarks(name, contact, maths, science, geometry, algebra);
	}

	public static void studentMarks(String name, long contact, int ... marks){

		System.out.println("\n Student Details\n ");
		System.out.println("Name : "+ name );
		System.out.print("Contact : "+ contact);

		int total = 0 ;
		for (int ele : marks ) {
			total += ele;
		}

		double per = (double)total/marks.length;

		System.out.println("Total marks: "+ total);
		System.out.println("Percentage : "+ per +" %");
	}
}
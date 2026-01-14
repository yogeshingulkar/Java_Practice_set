class VarArgsExample1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Name : ");
		String name = sc.nextInt();

		System.out.println("Enter a Contact : ");
		long contact = sc.nextLong();

		System.out.println("Enter a Subject marks : ");
		int marks = sc.nextInt();

		studentmarks(name , contact , subj1, subj2, subj3, subj4, subj5);

	}
	public static void studentmarks(String name , long contact , int ... marks){
		System.out.println("Name :"+ name );
		System.out.println("Contact : "+ contact);

		int total = 0 ;
		double per = (total/500.0)*100;

	}

}
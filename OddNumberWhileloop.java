class OddNumberWhileloop{
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=100){
			if(i%2!=0)
				System.out.print(i + " ");
				i++;
		}
		System.out.println();
		System.out.println("===================");
		System.out.println("===================");

		int j = 1;
		while(j<=100){
			if(j%2==0)
				System.out.print(j + " ");
				j++;
			}

			char ch = 'A';
			while(ch<='Z'){
			System.out.print(ch + ":" + (int)ch + " ");
				ch++;				
			}

			char chhh = 'A';
			while(chhh<='Z'){
				System.out.print(chhh + " ");
				chhh+=1;
			}


			char chh = 'A';
			while(chh<='Z'){
				System.out.print(chh + " ");
				chh+=2;
			}

	}
}
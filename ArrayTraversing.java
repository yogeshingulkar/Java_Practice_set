class ArrayTraversing
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};

		//using for loop
		for (int i = 0 ; i<arr.length ;i++) 
		{
			System.out.println(arr[i]+" ");
		}

		//using while loop
		while(i<arr.length){
			System.out.println(arr[i]+ " ");
			i++;
		}

		//using do-while loop
		int j = 0 ;
		do{
			System.out.println(arr[j]+" ");
			j++;
		}while(j < arr.length);
	}
}
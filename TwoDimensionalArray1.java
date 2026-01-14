import java.util.Arrays;
class TwoDimensionalArray1
{
	public static void main(String[] args) 
	{
		System.out.println("Before :");
		
		int [] [] arr = {{10,20,30,40,50},{60,70,80}};
		System.out.println(Arrays.deepToString(arr));

		System.out.println("------------------");
		System.out.println();
		System.out.println("After :");

		for (int [] arr1 : arr) 
		{
			for (int ele :arr1) 
			{
				System.out.print(ele+ " ");
			}
			System.out.println();
		}

	}
}
import java.util.Arrays;
class largestElementinArray
{
	public static void main(String[] args) 
	{
		// int [] arr = {1,2,3,4,67,9,3,5,46,7,8,8,9,};
		int [] arr = new int[20];
		for (int i = 0 ;i<arr.length ;i++ ) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		int max = largest(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int largest(int [] arr){

		int max = arr[0];
        for (int i = 1 ;i<arr.length ;i++ ) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
	}
}
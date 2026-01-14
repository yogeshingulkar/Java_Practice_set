import java.util.*;
class SentinelSearchRecursiveCall{
	public static void main(String[] args) {
		int [] arr = new int[20];
		for (int i = 0 ;i<arr.length-1;i++ ) 
			arr[i] = (int)(Math.random()*100); //(*100) - because it creates a random 2 digit values 

		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int pos2 = sentinelSearchRecursive(arr, n, key);

		System.out.println(key + " : " +pos1 );
		System.out.println(key + " : " +pos2 );
		}
		public static void sentinelSearchRecursive(int [] arr, int min, int max, int key){
			if(min>max) return -1 ;
			int mid = (min+max)/2;

			return -1;
		}
}
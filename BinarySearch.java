import java.util.Arrays;
class BinarySearch{
	public static void main(String[] args) {
		
		int [] arr = new int[20];
		for (int i = 0 ;i<arr.length ;i++ ) 
			arr[i] = (int)(Math.random()*100);

		int key = 21;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int pos1 = binarySearchRecursion(arr,0,arr.length-1,key);
		int pos2 = binarySearchIterative(arr,arr.length,key);
		System.out.println(key+" : "+ pos1);
		System.out.println(key+" : "+ pos2);
	}

	public static int binarySearchRecursion(int arr, int min, int max, int key){
		if(min>max) return -1;
		int mid = (max+min)/2;

		if(arr[mid]==key) return mid;
		else if(key<arr[mid]) return binarySearchRecursion(arr,mid,mid-1,key);
		else return binarySearchIterative(arr, mid+1,max,key);

	}

	public static int binarySearchIterative(int [] arr, int n , int key){
		int min = 0 , max = n-1 ;
	while(min<max){
		int mid =(max+min/2);
		if(arr[mid]==key) return mid;
		else if(key<arr[mid])
			else min = mid+1;
		}
		return -1;
	}
}
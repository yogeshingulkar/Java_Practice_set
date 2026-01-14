import java.util.*;
class TernerySearch{
	public static void main(String[] args)
	{
		int [] arr = new int[20];
		for (int i = 1;i<=20 ;i++) arr[i-1]=i;
		System.out.println(Arrays.toString(arr));
`
		System.out.print("Enter a Number : ");
		int key = new Scanner(System.in).nextInt();
		int pos1 = ternerySearchRecursive(arr,0,arr.length-1,key);
		int pos2 = ternerySearchIterative(arr,arr.length-1,key);
		System.out.println(key+" : "+ pos1);
		System.out.println(key+" : "+ pos2);

	}
	public static int ternerySearchIterative(int [] arr, int n , int key){
		int low = 0 ;
		int high = n ;

		while(low<=high){
			int mid1 = low+(high-low)/3;
			int mid2 = high-(high-low)/3;

			if(arr[mid1]==key) return mid1;
			if(arr[mid2]==key) return mid2;
			if(key<arr[mid1]) high = mid1-1;
			else if(key>arr[mid2]) low = mid2+1;
			else{
				low = mid1+1;
				high = mid2-1;
			}
		}
		return -1;
	}

	public static int ternerySearchRecursive(int [] arr,int low, int high , int key){

		if(low>high) return -1;
			int mid1 = low+(high-low)/3;
			int mid2 = high-(high-low)/3;

			if(arr[mid1]==key) return mid1;
			if(arr[mid2]==key) return mid2;
			if(key<arr[mid1]) return ternerySearchRecursive(arr,low,mid1-1,key);
			else if(key>arr[mid2]) return ternerySearchRecursive(arr,mid2+1,high,key);
			else return ternerySearchRecursive(arr,mid1+1,mid2-1,key);
	}
}

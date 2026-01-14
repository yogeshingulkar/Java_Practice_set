import java.util.Arrays;
class MergeSortExample1{
	public static void main(String[] args) {
		
		int [] arr = {6,5,4,3,7,8,9,1,0};
		System.out.println("Before : "+ Arrays.toString(arr));
		mergeSort(arr,l,r);
		System.out.println("After  : "+ Arrays.toString(arr));
	}
	public static void mergeSort(int [] arr, int l, int r)
	{
		if(l<r){
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	public static void merge(int [] arr, int l, int mid, int r){

		int lenL = mid-l+1;
		int lenR = r-mid;

		// this arrays will be intialize with default values.
		int [] left = new int[lenL];
		int [] right = new int[lenR];

		// 
		for (int i = 0;i<lenL ;i++) left[i]=arr[l+i];
		for (int i = 0;i<lenR ;i++) right[i]=arr[mid+l+i];

		int i = 0 , j = 0 , k = l;

		while(i<lenL) arr[k++]= left[i++];
		while(i<lenR) arr[k++]= right[j++];

	}
}
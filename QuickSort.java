import java.util.Arrays;
class QuickSort{
	public static void main(String[] args) {
		
		int [] arr = {5,4,3,2,8,6,9,0,1,7};
		System.out.println("Before : "+ Arrays.toString(arr));
		quickSort(arr, 0,arr.length-1);
		System.out.println("After  : "+ Arrays.toString(arr));
	}

	public static void quickSort(int [] arr, int start, int end){
		if(end<start) return ;
		int pivotIndx = partition(arr, start, end);
		quickSort(arr, start, pivotIndx-1);
		quickSort(arr,pivotIndx+1,end);
	}

	public static int partition(int [] arr, int start, int end){
		//PIVOT initialize with the end index
		int pivot = arr[end];
		// and start the j behind of i index i.e;
		int j = start - 1;

		for (int i = start ;i<end ;i++){
			if(arr[i]<pivot){
				j++;
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
		j++;
		int temp = arr[j];
		arr[j] = arr[end];
		arr[end] = temp;
		return j;
	}
}
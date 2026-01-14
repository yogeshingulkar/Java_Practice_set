import java.util.Arrays;
class BubbleSortRecursion{
	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,6,0,3,9,1};
		System.out.println("Main Before : "+Arrays.toString(arr));
		bubbleSort(0,arr, arr.length);
		System.out.println("Main After : "+Arrays.toString(arr));
	}

	public static void bubbleSort(int i , int [] arr, int n ){
		if(i<n-1) return ;
		innerIteration(i+1,arr,i,n);
		bubbleSort(++i,arr,n);
	}
	public static void innerIteration(int j, int [] arr, int i, int n){
		if(j>n-1) return ;
		if(arr[i]>=arr[j]){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp ;
		}
		innerIteration(++j,arr,i,n);
	}
}
import java.util.Arrays;
class BinarySearchShree{
	public static void main(String[] args) {
		
		int [] arr = {1,7,4,3,2,6,5};
		System.out.println("Main Before : " +Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("Main After  : " + Arrays.toString(arr));
	}

	public static void bubbleSort(int [] arr, int n ){

		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1;j<arr.length ;j++ ) {
				if(arr[i]>=arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}
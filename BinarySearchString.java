import java.util.Arrays;
class BinarySearchString{
	public static void main(String[] args) {
		
		String [] arr = {"RAMESH", "SURESH", "MAHESH","GANESH", "RAJESH"};
		System.out.println("Main Before : " +Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("Main After  : " + Arrays.toString(arr));
	}

	public static void bubbleSort(String [] arr, int n ){

		for (int i = 0 ;i<n-1 ;i++ ) {
			for (int j = i+1;j<n;j++ ) {
				if((arr[i].compareTo(arr[j]))>0){
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}
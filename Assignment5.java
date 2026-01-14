import java.util.*;
class Assignment5{
	public static void main(String[] args) {
		int [] arr1 = {10, 20,20, 30, 40, 50};
		int [] arr2 = {20, 40,60, 60, 70}; 
		int [] arr3 = new int[arr1.length + arr2.length];

		for (int i=0, j=0; i<arr3.length ; i++) {
			if(i<arr1.length){
				arr3[i] = arr1[i];
			}
			else if(i>arr2.length){
				arr3[i] = arr2[j++];
			}
		}
		Arrays.sort(arr3);
		unionElement(arr3);
	}

	public static void unionElement(int [] arr){
		System.out.println(Arrays.toString(arr));
		int cnt=0;

		for (int i=0; i<arr.length-1 ; i++) {
		if (arr[i]==arr[i+1]) {
				cnt++;
			}
		}

		int [] union = new int[arr.length-cnt];
		int j=0;
		// [10, 20, 20, 20, 30, 40, 40, 50, 60]
		for (int i=0; i<arr.length-1 ; i++ ) {
			if (arr[i]!=arr[i+1]) {
				union[j++] = arr[i]; // 10 
			}
		}
		union[j++] = arr[arr.length-1];
		System.out.println(Arrays.toString(union));
	}
}


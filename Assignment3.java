import java.util.Arrays;
import java.util.Scanner;

// // 1) Rotate an array Clockwise

// class Assignment3{
// 	public static void main(String[] args) {
		
// 		int [] arr = {1,2,3,4,5,6,7,8,9};

// 		System.out.println("Before: "+Arrays.toString(arr));

// 		System.out.print("Enter the Rotation: ");

// 		int rotate = new Scanner(System.in).nextInt();
// 		for (int i=1; i<=rotate ; i++) {
			
// 			int temp = arr[0]; 
// 			for (int j=1; j<arr.length ; j++) {

// 				arr[j-1] = arr[j];
// 			}
// 			arr[arr.length-1] = temp;
// 		}
// 		System.out.println("After: "+Arrays.toString(arr));
// 	}
// }

// // 2) Rotate an array Anti-Clockwise

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {1,2,3,4,5,6,7,8,9};

// 		System.out.println("Before: "+Arrays.toString(arr));

// 		System.out.print("Enter the Rotations: ");
// 		int rotate = new Scanner(System.in).nextInt();

// 		for (int i=1; i<=rotate ; i++) {

// 			int temp = arr[arr.length-1];

// 			for (int j=arr.length-2; j>=0 ; j--) {

// 				arr[j+1] = arr[j];
// 			}
// 			arr[0] = temp;
// 		}
// 		System.out.println("After: "+Arrays.toString(arr));
// 	}
// }

// 3) Moves Zeros from array

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {1, 2, 0, 0, 9 , 6, 0, 8};

// 		int k=0;

// 		System.out.println("Before Moves 0: "+Arrays.toString(arr));

// 		for (int i=0; i<arr.length ; i++) {
			
// 			if (arr[i]!=0) {
// 				arr[k] = arr[i];
// 				k++;
// 			}
// 		}
// 		for(int i=k; i<arr.length; i++){
// 			arr[i] = 0;
// 		}
// 		System.out.println("After Moves 0: "+Arrays.toString(arr));
// 	}
// }

// 4) Even and Odd Elements of an Array seperation
// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {1,2,3,4,5,6,7,8};

// 		System.out.println(Arrays.toString(arr));

// 		int cnt = arr.length;
// 		for (int i=0; i<cnt; i++) {
// 			if (arr[i]%2==0) {
// 				cnt--;
// 				int j = i+1;
// 				while(j<arr.length && arr[j]%2==0){
// 					j++;
// 				}
// 				if(j==arr.length) break;

// 				int temp = arr[j];
// 				for (int k=j; k>i ; k--) {
// 					arr[k] = arr[k-1];
// 				}
// 				arr[i] = temp;
// 			}
// 		}
// 		System.out.println(Arrays.toString(arr));
// 	}
// }

// 5)  Positive and Negative Elements of an Array seperation

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {-1, 4 , 2, -9, 3, -5, 7};

// 		System.out.println(Arrays.toString(arr));
// 		int cnt=arr.length;
// 		for (int i=0; i<cnt; i++) {
// 			if(arr[i]>0){
// 				cnt--;
// 				int j=i+1;

// 				while(j<arr.length && arr[j]>0){
// 					j++;
// 				}
// 				if(j==arr.length) break;
// 				int temp = arr[j];

// 				for (int k=j; k>i ; k--) {
// 					arr[k] = arr[k-1];
// 				}
// 				arr[i] = temp;
// 			}
// 		}
// 		System.out.println(Arrays.toString(arr));
// 	}
// }

// // 6) 1st largest element of an array (unsorted)

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {2,7,3,1,8,9,4,6,5};

// 		int max = Integer.MIN_VALUE;

// 		for (int ele : arr) {
// 			if (max<ele) {
// 				max=ele;
// 			}
// 		}
// 		System.out.println(max);
// 	}
// }

// 7) 1st smallest element of an array (unsorted)

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr = {2,7,3,1,8,9,4,6,5};

// 		int min = Integer.MAX_VALUE;

// 		for (int ele : arr) {
// 			if (min>ele) {
// 				min=ele;
// 			}
// 		}
// 		System.out.println(min);
// 	}
// }

// 8) 1st largest element of an array(Sorted)

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr ={2,7,3,1,8,9,4,9,6,5};
// 		Arrays.sort(arr);

// 		System.out.println(Arrays.toString(arr));
// 		int max = Integer.MIN_VALUE;
// 		for (int ele : arr) {
			
// 			if (max<ele) {
// 				max=ele;
// 			}
// 		}
// 		System.out.println(max);
// 	}
// }

// 9) 1st smallest element of an array(Sorted)

// class Assignment3{

// 	public static void main(String[] args) {
		

// 		int [] arr ={2,7,3,1,8,9,4,9,6,5};
// 		Arrays.sort(arr);
// 		int min = Integer.MAX_VALUE;
// 		for (int ele : arr) {
			
// 			if (min>ele) {
// 				min=ele;
// 			}
// 		}
// 		System.out.println(min);
// 	}
// }

// 10) 2nd largest element of array (unsorted)

// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr ={2,7,3,1,8,9,4,9,6,5};

// 		int max1 = Integer.MIN_VALUE;
// 		int max2 = 0;

// 		for (int ele : arr) {
// 		 	if (max1<ele) {
// 		 		max2=max1;
// 		 		max1=ele;
// 		 	}
// 		}
// 		System.out.println(max2);
// 	}
// }

// 11) 2nd smallest element of array (unsorted)
// class Assignment3{

// 	public static void main(String[] args) {
		
// 		int [] arr ={2,7,3,1,8,9,4,9,6,5};

// 		int min1 = Integer.MAX_VALUE;
// 		int min2 = 0;

// 		for (int ele : arr) {
// 			if (min1>ele) {
// 				min2=min1;
// 				min1=ele;
// 			}
// 		}
// 		System.out.println(min2);
// 	}
// }

// 12) 2nd largest element of array (sorted)

// class Assignment{

// 	public static void main(String[] args) {
		
// 		int [] arr ={2,7,3,1,8,9,4,9,6,5};
// 		Arrays.sort(arr);
// 		System.out.println(Arrays.toString(arr));
// 		int max1 = Integer.MIN_VALUE;
// 		int max2 = 0;

// 		for (int ele : arr) {
// 			if (max1<ele) {
// 				max2=max1;
// 				max1=ele;
// 			}
// 		}
// 		System.out.println(max2);
// 	}
// }

// 13) 2nd smallest element of array (sorted)

class Assignment{

	public static void main(String[] args) {
		
		int [] arr ={2,7,3,1,8,9,4,9,6,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int min1 = Integer.MAX_VALUE;
		int min2 = 0;

		for (int ele : arr) {
			if (min1>ele) { //2147483647>2 -> true
				min2=min1; // 2 -> min2(assigned)
				min1=ele; //
			}
			else if(ele>min1 && ele<min2){
				min2=ele;
			}
		}
		System.out.println(min2);
	}
}
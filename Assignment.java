// 1) Traversing Using for loop for 2D
// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{1, 2, 3},{4, 5, 6,7}};

// 		for (int i=0; i<arr.length ; i++) {
			
// 			for (int j=0; j<arr[i].length ; j++) {
// 				System.out.print(arr[i][j]+" ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// 2) Traversing Using while loop for 2D

// class Assignment{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{1, 2, 3},{4, 5, 6, 7}};

// 		int i=0;
// 		while(i<arr.length){
// 			int j=0;
// 			while(j<arr[i].length){
// 				System.out.print(arr[i][j]+" ");
// 				j++;
// 			}
// 			i++;
// 			System.out.println();
// 		}
// 	}
// }

// 3) Traversing Using do while loop for 2D

// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{1, 2, 3},{4, 5, 6, 7}};

// 		int i=0;
// 		do{
// 			int j=0;
// 			do{
// 				System.out.print(arr[i][j]+" ");
// 				j++;
// 			}while(j<arr[i].length);
// 		i++;
// 		System.out.println();
// 		}while(i<arr.length);
// 	}
// }

// 4) Traversing Using for-Each loop for 2D

// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{1, 2, 3},{4, 5, 6, 7}};

// 		for (int [] ele : arr) {
// 			for (int ele2 : ele) {
// 				System.out.print(ele2+" ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// 5) Find even and odd element and creates there array

// import java.util.Arrays;
// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{1, 2, 3},{4, 5, 6, 7}};

// 		int eSize = 0, osize = 0;
// 		for (int [] ele : arr) {
// 			for (int ele2 : ele) {
// 				if (ele2%2==0) eSize++;
// 				else osize++;
// 			}
// 		}

// 		int [] even = new int[eSize];
// 		int [] odd = new int[osize];

// 		int i =0;
// 		int j =0;
// 		for (int [] ele : arr) {
			
// 			for(int ele2 : ele){

// 				if (ele2%2==0) {
// 					even[i++] = ele2;
// 				}
// 				else{
// 					odd[j++] = ele2;
// 				}
// 			}
// 		}
// 		System.out.println(Arrays.toString(even));
// 		System.out.println(Arrays.toString(odd));
// 	}
// }

// 6) Merge two Different Arrays

// import java.util.Arrays;
// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [] a = {10, 20, 30, 40};
// 		int [] b = {50, 60, 70};

// 		int [] c = new int[a.length+b.length];

// 		for (int i=0, index = 0; i<c.length ; i++) {
			
// 			if(i<a.length) c[i] = a[i];
// 			else c[i] = b[index++];
// 		}
// 		System.out.println(Arrays.toString(c));
// 	}
// }

// 7) Merge two Different Arrays 

// import java.util.Arrays;
// class Assignment{

// 	public static void main(String[] args) {
// 		int [] a = {10, 20, 30, 40};
// 		int [] b = {50, 60, 70, 80, 90};

// 		int [] c = new int[a.length+b.length];

// 		int index = 0;
// 		for (int i =0; i<a.length ; i++) {
// 			if(i<a.length) c[index++] = a[i];
// 		}
// 		for (int i=0; i<b.length ; i++) {
// 			if(i<b.length) c[index++] = b[i];
// 		}

// 		System.out.println(Arrays.toString(c));
// 	}
// }

// 8) Merge 2D array

// import java.util.Arrays;
// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [][] arr = {{10, 20, 30, 40},{50, 60, 70, 80, 90}};

// 		int size = 0;
// 		for (int [] ele: arr) {
// 			for (int ele2 : ele) size++;
// 		}

// 		int [] merge = new int[size];
// 		int i = 0;
// 		for (int [] ele : arr) {
// 			for (int ele2 : ele) merge[i++] = ele2;
// 		}

// 		System.out.println(Arrays.toString(merge));

// 	}
// }

// 9) Reverse Array

// import java.util.Arrays;

// class Assignment2{

// 	public static void main(String[] args) {
		
// 		int [] arr = {1,2,3,4,5,6,7};
// 		int [] rev = new int[arr.length];
// 		for (int i=0, j=arr.length-1; i<arr.length ; i++, j--) {
			
// 			int temp = arr[i];
// 			arr[i] = rev[j];
// 			rev[j] = temp;
// 		}
// 		System.out.println(Arrays.toString(rev));
// 	}
// }

// 10) ZigZag merging of an Array

// import java.util.Arrays;

// class Assignment{

// 	public static void main(String[] args) {
		
// 		int [] a = {10, 20, 30, 40};
// 		int [] b = {50, 60, 70, 80, 90};

// 		int [] zigZag = new int[a.length+b.length];

// 		for (int i=0, index = 0; i<zigZag.length ; i++) {
			
// 			if (i<a.length) zigZag[index++]  = a[i];
// 			if(i<b.length) zigZag[index++] = b[i];
// 		}
// 		System.out.println(Arrays.toString(zigZag));
// 	}
// }

// 11) Random Vowels and Consonants In two Different arrays

import java.util.Arrays;
class Assignment2{

	public static void main(String[] args) {
		
		char [] arr = new char[20];

		for (int i=0; i<20; i++) {
			
			char ch = (char) (Math.random()*100);

			if (!(ch>=65 && ch<=90)) {
				i--;
				continue;
			}
			arr[i] = ch;
		}
		System.out.println(Arrays.toString(arr));

		int v = 0;
		int c = 0;

		for (char ele : arr) {
			if (ele=='A' || ele=='E' || ele=='I'|| ele=='O' || ele=='U') v++;
			else c++;
		}

		char [] vowel = new char[v];
		char [] consonant = new char[c];

		int i =0, j=0;
		for (char ele : arr) {
			
			if (ele=='A' || ele=='E' || ele=='I'|| ele=='O' || ele=='U') vowel[i++] = ele;
			else consonant[j++] = ele;
		}

		System.out.println("Vowel: "+Arrays.toString(vowel));
		System.out.println("Consonant: "+Arrays.toString(consonant));
	}
}


import java.util.Arrays ;
import java.util.Scanner ;

class Assignment6{
	public static void main(String[] args) {
		
	}
	int [] arr1 = {10,20,30,40,50,60};
	int [] arr2 = {20,40,60,70};
	int [] arr3 = new int[arr1.length + arr2.length];

	for (int i  = 0,j=0 ;i<arr3.length ;i++ ) {
		if(i<arr1.length){
			arr3[i] == arr1[i];
		}else if(i>arr2.length){
			arr3[i]= arr2[j++];
		}
		Arrays.sort(arr3);
	unionElement(arr3);
	}

}
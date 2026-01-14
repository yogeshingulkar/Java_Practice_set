import java.util.Arrays;

class ForwardForLoop{
	public static void main(String[] args) {
		
	int [] arr = {10,20,30,40,50};

	int cnt = 0 ;
	for (int i = 0 ;i<arr.length ;i++) 
	{
		System.out.println(arr[i]);	
		cnt++;
	}	
	System.out.println(cnt);		
}
}

import java.util.Arrays;

class ForwardForLoop{
	public static void main(String[] args) {
		
	int [] arr = {10,20,30,40,50};

	int cnt = 0 ;
	for (int i = arr.length ;i>0;i--) 
	{
		System.out.println();
		cnt++;
	}	
	System.out.println(cnt);		
	}
}
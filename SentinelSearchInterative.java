import java.util.Arrays;
class SentinelSearchInterative{
	public static void main(String[] args) {
		
		int [] arr = new int[20];
		for (int i = 0 ;i<arr.length ;i++) 
			// arr[i] = (int)(Math.random()*100);
			arr[i] = i+1;
			
			System.out.println(Arrays.toString(arr));
			int key = 30;

			int pos  = sentinelSearch(arr,arr.length, key);
			System.out.println(key +" : "+ pos);
	}
		public static int sentinelSearch(int [] arr,int n ,int key){

			int last = arr[n-1]; //last element stored 
			arr[n-1] = key ; //sentinel placed (replaced with last element )

			int i = 0 ;
			while(arr[i]!=key) 
				i++;
			
			arr[n-1] = last ; //sentinel placed at last element 

			if(i<n && arr[i]==key) return i ;
			// if(i<n-1 || arr[i]==key) return i ; //newly updated
			else return -1;
		}
}

// it will help thorugh the ARRAYINDEXOUTOFBOUNDSEXCEPTION
// and infinite loop.
// sentinel is nothing but a leader or guard.
// which is always in the last of the array.
// key is the sentinel 
//sentinel is faster as compared to others 
import java.util.Arrays;
class SentinelSearchRecursive{
	public static void main(String[] args) {
		
		int [] arr = new int[20];
		for (int i = 0 ;i<arr.length ;i++) 
			// arr[i] = (int)(Math.random()*100);
			arr[i] = i+1;
			
			System.out.println(Arrays.toString(arr));
			int key = 20;

			int pos  = sentinelSearch(arr,arr.length, key);
			System.out.println(key +" : "+ pos);
	}
		public static int sentinelSearch(int [] arr,int n ,int key){

			int last = arr[n-1]; //last element stored 
			arr[n-1] = key ; //sentinel placed (replaced with last element )


			int i = recursiveSearch(arr,key,0) ;
			while(arr[i]!=key) i++;
			
			arr[n-1] = last ; //sentinel placed at last element 

			if(i<n && arr[i]==key) return i ; 
			else return -1; 
		}

		public static int recursiveSearch(int[] arr, int key, int i) {
        	if (arr[i] == key) return i;
        	return recursiveSearch(arr, key, ++i);
    }
}

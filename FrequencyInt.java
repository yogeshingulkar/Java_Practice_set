import java.util.Arrays;
class FrequencyInt{
	public static void main(String[] args) {
		int [] arr = {1,3,2,3,4,5,5,6,3,5,2,3,2,3,4};
		boolean [] trace = new boolean [arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0, cnt=1 ;i<arr.length ;i++,cnt=1 ) 
		{
			if(trace[i]) continue;
			for (int j = i+1;j<arr.length ;j++ ) 
			{
				if(arr[i] == arr[j]){
					cnt++; 
					trace[i] = true;
				}				
			}
			System.out.println(arr[i]+" "+cnt);
		}
	}
}
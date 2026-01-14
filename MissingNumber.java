import java.util.Arrays;
class MissingNumber{
	public static void main(String[] args) {
		int [] arr = {3,4,2,1,7,9,8};
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr)); //sorted Array
		System.out.println(missingnumber(arr));
 	}
 	public static int missingnumber(int [] arr){
 		int cnt = 1 ;
 		for (int i = 0 ;i<arr.length ; i++) {
			if(arr[i]==cnt){
				cnt++;
				continue;
			} 			
			if(arr[i]!=cnt) return cnt ;
 		}
 		return 0 ;
 	}
}
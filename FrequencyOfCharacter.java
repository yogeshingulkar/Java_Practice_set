import java.util.*;
class FrequencyOfCharacter{
	public static void main(String[] args) {
		
		String str = "aabbbcdddde";		
		// solve(str);
		String op = check(str);
		System.out.println(op);
	}

	public static void solve(String str){

		char [] arr = str.toCharArray();

		boolean [] t = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
				if(t[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i]==arr[j]){
					cnt++;
					t[j] = true;
				}
				System.out.print(arr[i]+""+(cnt));
		}
	}
}
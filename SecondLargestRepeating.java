// Second Largest Repeating
import java.util.Arrays;
class SecondLargestRepeating{
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 1, 5, 5, 6, 7, 8, 1, 1, 1, 4, 3, 2, 3};
		System.out.println(Arrays.toString(arr));
		boolean[] fre = new boolean[arr.length]; // boolean values

		int larg1 = Integer.MIN_VALUE; //-2147483847
		int larg2 = Integer.MIN_VALUE; //-2147483847

		int maxFre = 0;
		int secondMaxFre = 0;
		
		for (int i=0; i<arr.length ; i++) {
			if(fre[i]) continue; 
			
			int cnt = 1;
			for (int j=i+1; j<arr.length ; j++) {
				if (arr[i]==arr[j]) {
					cnt++;
					fre[j] = true;
				}
			}
			if (cnt>maxFre) {
				secondMaxFre = maxFre;
				larg2 = larg1;

				maxFre = cnt;
				larg1 = arr[i];
			}
			else if(cnt>secondMaxFre && cnt<maxFre)
			{
				secondMaxFre = cnt;
				larg2 = arr[i];
			}
		}
		System.out.println(larg2);
	}
}
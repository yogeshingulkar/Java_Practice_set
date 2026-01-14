// Second Least Repeating
import java.util.Arrays;
class SecondLeastRepeating{
	public static void main(String[] args) {
		
		int[] arr = {3,1,5,5,2,1,5,1,1,5};
		System.out.println(Arrays.toString(arr));
		boolean [] fre = new boolean[arr.length];

		int minRep  = Integer.MAX_VALUE;
		int minRep2 = Integer.MAX_VALUE;
		
		int ele = 0, ele2 = 0;
		
		for (int i=0; i<arr.length ; i++) {
			if (fre[i]) continue;
			int cnt = 1;
			for (int j=i+1; j<arr.length ; j++) {
				
				if (arr[i]==arr[j]) {
					cnt++;
					fre[j] = true;
				}
			}
			if (minRep>cnt) {
				minRep2 = minRep;
				ele2 = ele;
				minRep = cnt;
				ele = arr[i];
			}
			else if(cnt>minRep && cnt<minRep2){
				minRep2 = cnt;
				ele2 = arr[i];
			}
		}
		System.out.println(ele2);
	}
}

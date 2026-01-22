class StringFrequency{

	public static void main(String[] args) {
		
		String str = "hippopotammus";

		System.out.println(str);
		// frequencyOfCharacter(str.toCharArray(), str.length());
		// duplicateCharacter(str.toCharArray(), str.length());
		// distinctCharacter(str.toCharArray(), str.length());
		// uniqueCharacter(str.toCharArray(), str.length());

		// char ch = firstHighestRepChar(str.toCharArray(), str.length());
		// System.out.println(ch);

		// char ch = firstLowestRepChar(str.toCharArray(), str.length());
		// System.out.println(ch);

		// char ch = secondHighestRepChar(str.toCharArray(), str.length());
		// System.out.println(ch);

		// char ch = secondLowestRepChar(str.toCharArray(), str.length());
		// System.out.println(ch);
	}

	public static char secondLowestRepChar(char[] arr, int n){

		boolean[] t = new boolean[n];
		int min1 = Integer.MAX_VALUE, min2 = min1;
		char ch1 = ' ', ch2 = ch1;
		for (int i=0; i<n ; i++) {
			
			if(t[i]) continue;
			int cnt = 1;
			for (int j=i+1; j<n ; j++) {
				if(arr[i]==arr[j]){
					cnt++;
					t[j] = true;
				}
			}
			if(min1>cnt){
				min2=min1;
				ch2=ch1;

				min1=cnt;
				ch1=arr[i];
			}
			else if(min2>cnt){
				min2=cnt;
				ch2 = arr[i];
			}
		}
		return ch2;
	}


	public static char secondHighestRepChar(char[] arr, int n){

		boolean[] t = new boolean[n];
		int max1 = Integer.MIN_VALUE, max2 = max1;
		char ch1 = ' ', ch2 = ch1;
		for (int i=0; i<n ; i++) {
			
			if(t[i]) continue;
			int cnt = 1;
			for (int j=i+1; j<n ; j++) {
				if(arr[i]==arr[j]){
					cnt++;
					t[j] = true;
				}
			}
			if(max1<cnt){
				max2=max1;
				max1=cnt;

				ch2=ch1;
				ch1=arr[i];
			}
			else if(max2<cnt && cnt!=max1){

				ch2 = arr[i];
			}
		}
		return ch2;
	}

	public static char firstLowestRepChar(char[] arr, int n){

		boolean[] t = new boolean[n];
		int mix = Integer.MAX_VALUE;
		char ch = ' ';
		for (int i=0; i<n ; i++) {
			
			if(t[i]) continue;
			int cnt = 1;
			for (int j=i+1; j<n ; j++) {
				if(arr[i]==arr[j]){
					cnt++;
					t[j] = true;
				}
			}
			if(mix>cnt){
				mix=cnt;
				ch=arr[i];
			}
		}
		return ch;
	}

	public static char firstHighestRepChar(char[] arr, int n){

		boolean[] t = new boolean[n];
		int max = Integer.MIN_VALUE;
		char ch = ' ';
		for (int i=0; i<n ; i++) {
			
			if(t[i]) continue;
			int cnt = 1;
			for (int j=i+1; j<n ; j++) {
				if(arr[i]==arr[j]){
					cnt++;
					t[j] = true;
				}
			}
			if(max<cnt){
				max=cnt;
				ch=arr[i];
			}
		}
		return ch;
	}

	public static void uniqueCharacter(char[] arr, int n){

		boolean[] t = new boolean[n];

		for (int i=0; i<arr.length ; i++) {

			if(t[i]) continue;
			int cnt=1;
			for (int j=i+1; j<arr.length ; j++) {
				
				if (arr[i]==arr[j]) {
					cnt++;
					t[j] = true;
				}
			}
			if(cnt==1) System.out.print(arr[i]);
		}
	}

	public static void distinctCharacter(char[] arr, int n){

		boolean[] t = new boolean[n];

		for (int i=0; i<arr.length ; i++) {

			if(t[i]) continue;
			int cnt=1;
			for (int j=i+1; j<arr.length ; j++) {
				
				if (arr[i]==arr[j]) {
					cnt++;
					t[j] = true;
				}
			}
			System.out.print(arr[i]);
		}
	}


	public static void duplicateCharacter(char[] arr, int n){

		boolean[] t = new boolean[n];

		for (int i=0; i<arr.length ; i++) {

			if(t[i]) continue;
			int cnt=1;
			for (int j=i+1; j<arr.length ; j++) {
				
				if (arr[i]==arr[j]) {
					cnt++;
					t[j] = true;
				}
			}
			if(cnt>1) System.out.println(arr[i]);
		}
	}

	public static void frequencyOfCharacter(char[] arr, int n){

		boolean[] t = new boolean[n];

		for (int i=0; i<arr.length ; i++) {

			if(t[i]) continue;
			int cnt=1;
			for (int j=i+1; j<arr.length ; j++) {
				
				if (arr[i]==arr[j]) {
					cnt++;
					t[j] = true;
				}
			}
			System.out.println(arr[i]+": "+cnt);
		}
	}
}
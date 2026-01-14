class MissingElements{

	public static void main(String[] args) {
			
		int [] arr = {1,3,5,2,7};

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int ele : arr) {
			
			if (min>ele) {
				min=ele;
			}

			if (max<ele) {
				max=ele;
			}
		}
				//i=1   i<=7 
		for (int i=min; i<=max ; i++) {
			int ele= contains(arr,i);
			if (ele!=0) {
				System.out.print(ele+" ");
			}
		}
	}

	public static int contains(int [] arr, int ele){

		for (int i=0; i<arr.length ; i++) {
			
			if (arr[i]==ele) {
				return 0;
			}
		}

		return ele;
	}
}
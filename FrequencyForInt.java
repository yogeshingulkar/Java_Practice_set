import java.util.Arrays;
// 1 .frequency of each element in an array
class FrequencyForInt
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,5,6,7,8,5,4,3,2,1};

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));
		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
				if(trace[i])continue;
			for(int j = i+ 1; j < arr.length;j++)
				if(arr[i] == arr[j])
				{
					cnt++;
					trace[j] = true;
				}
				System.out.println(arr[i] + " : " + cnt);
			}
		}
	}

// 2) Duplicate elements
class FrequencyForInt
{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5,5,6,7,8,5,4,3,2,6,7};

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
				if(trace[i])continue;
			for(int j = i+ 1; j < arr.length;j++)
				if(arr[i] == arr[j])
				{
					cnt++;
					trace[j] = true;
				}
				if(cnt > 1)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

//3) unique Elements of the array 
class FrequencyForInt
{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5,5,6,7,8,5,4,3,2,6,7};
		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i] == arr[j])
				{
					cnt++;
					trace[j] = true;
				}

				if(cnt == 1)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}


// 4)  distinct element
class FrequencyForInt
{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5,5,6,7,8,5,4,3,2,6,7,9};

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)
				if(arr[i] == arr[j])
				{
					cnt++;
					trace[j] = true;
				}
					System.out.println(arr[i]);
			}
		}
	}
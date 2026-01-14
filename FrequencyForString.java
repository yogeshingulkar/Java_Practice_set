import java.util.*;

// 1) frequency of each word in a string.
class FrequencyForString
{
	public static void main(String[] args){
		String str = "Hello i am ramesh i am from Pune";

		String [] arr = str.split(" ");

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
			
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i].equals(arr[j]))
				{
					cnt++;
					trace[j] = true;
				}

					System.out.println(arr[i] + " : " + cnt);
				

			}

		
	}
}

// 2) distinct word in string 

class FrequencyForString
{
	public static void main(String[] args){
		String str = "Hello i am ramesh i am from Pune";

		String [] arr = str.split(" ");

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
			
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i].equals(arr[j]))
				{
					cnt++;
					trace[j] = true;
				}

					System.out.println(arr[i]);
				

			}

		
	}
}

// 3) Duplicate  words in string

class FrequencyForString
{
	public static void main(String[] args){
		String str = "Hello i am ramesh i am from Pune";

		String [] arr = str.split(" ");

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
			
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i].equals(arr[j]))
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


// 4) unique words in string

class FrequencyForString
{
	public static void main(String[] args){
		String str = "Hello i am ramesh i am from Pune";

		String [] arr = str.split(" ");

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
			
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++)

				if(arr[i].equals(arr[j]))
				{
					cnt++;
					trace[j] = true;
				}

				if(cnt ==  1)
				{
					System.out.println(arr[i]);
				}
				

			}

		
	}
}
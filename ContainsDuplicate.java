import java.util.Arrays;
class ContainsDuplicate
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,1,2,3};
		int k = 2 ;

		boolean op = containsNearbyDuplicate(arr,k);
		System.out.println(op);

	}
    public static boolean containsNearbyDuplicate(int[] arr, int k) 
    { 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length && (j-i)>=k; j++) {
                
                // if(k > (j - i) && arr[i] == arr[j])
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

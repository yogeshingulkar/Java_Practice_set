import java.util.Arrays;

// 217) Contains Duplicates
class  Solution3{
    public static void main(String [] args){

        int [] nums = {2,14,18,22,22};

        System.out.println(containsDuplicate(nums));
    }

        public static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for (int i=0; i<nums.length ; i++) {
            
            if(nums[i]==nums[i+1]) return true;
        }

        return false;
    }
}

// 219) Contains Duplicates 2

class Solution3{

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,1};
        int k=2;

        boolean op = containsDuplicates(arr, k);
        System.out.println(op);
    }

    public static boolean containsDuplicates(int[] arr, int k){

        for (int i=0; i<arr.length ; i++) {
            for (int j=i+1; j<arr.length && j-i<=k; j++) {
                if (arr[i]==arr[j]) return true;
            }
        }
        return false;
    }
}


// 268) Missing Elements

class Solution3{
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,5};
        int length = arr.length+1;
        int sum=0;
        for (int ele : arr) {
            sum+=ele;
        }
        int totalSum = length*(length+1)/2;
        System.out.println(totalSum-sum);
    }
}

// 283) Moves Zeros

class Solution3 {

    public static void main(String [] args) {
        int k =0;
        int [] nums = {0,1,0,3,12};
        for(int i=0 ; i<nums.length; i++){
            if(nums[i]!=0){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i=k; i<nums.length; i++){
            nums[i]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

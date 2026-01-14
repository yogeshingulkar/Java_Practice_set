class ContainsDuplicate2Example{
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,5,6,7,8,9};
        containsDuplicate();
    }

    public boolean containsDuplicate(int k, int ... nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }   
}
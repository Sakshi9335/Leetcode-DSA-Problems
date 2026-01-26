class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int i =n-1;
        while(i>0 && nums[i-1]<nums[i])
        {
            i--;
        }
        return i;
    }
}
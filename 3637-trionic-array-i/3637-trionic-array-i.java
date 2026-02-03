class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i =0;
        if(n<4)
        return false;
        while(i+1 < n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0)
        return false;
        while(i+1 < n && nums[i]>nums[i+1]){
            i++;
        }
        if (i == n - 1)
            return false;
        while(i+1 < n && nums[i]<nums[i+1]){
            i++;
        }
        if (i == n - 1)
            return true;
        else
            return false;
    }
}
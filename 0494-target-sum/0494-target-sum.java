class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums,target,0,0);
        return count;
    }
    public void helper(int[]nums,int tar,int sum,int i){

        if(i==nums.length){
            if(sum==tar){
                count++;
            }
            return;
        }
        //include
        helper(nums,tar,sum+nums[i],i+1);
        //exclude
         helper(nums,tar,sum-nums[i],i+1);
    }
}
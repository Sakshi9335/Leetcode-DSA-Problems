class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
        
    }

    public int solve(int[]nums,int target,int i,int currsum){
        if(i==nums.length){
            if(currsum==target){
                return 1;
            }
            else 
               return 0;
        }
        int plus=solve(nums,target,i+1,currsum+nums[i]);
         int minus=solve(nums,target,i+1,currsum-nums[i]);
        return plus+minus;
    }
}
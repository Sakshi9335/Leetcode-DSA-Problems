class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return solve(0,dp,nums);
    }
    public int solve(int i, int[]dp,int[]nums){
         if (i >= nums.length)
        {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = nums[i]+solve(i+2,dp,nums);
        int nonpick = solve(i+1,dp,nums);
        return dp[i] = Math.max(pick,nonpick);
    }
}
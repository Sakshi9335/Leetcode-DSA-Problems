class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
         int n = nums.size();
      int[][]dp = new int[n][target + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        int ans = solve(0, target, nums,dp);
        if(ans<0) return -1;
        else return ans;
    }

    public int solve(int i,int target,List<Integer> nums,int[][]dp)
    {
        int n=nums.size();
        if (target == 0) return 0;
        if (i == n) return Integer.MIN_VALUE;
        if (dp[i][target] != -1) return dp[i][target];
        int skip = solve(i + 1, target, nums,dp);
        int pick = Integer.MIN_VALUE;
        if (nums.get(i) <= target) 
        {
            pick = 1 + solve(i + 1, target - nums.get(i), nums,dp);
        }
        return dp[i][target] = Math.max(pick, skip);
    }
}
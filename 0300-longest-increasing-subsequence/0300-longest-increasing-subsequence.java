class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(0, -1, dp, nums);
    }

    public int solve(int i, int prev, int[][] dp, int[]nums) {
        int n = nums.length;
        if (i == n)
            return 0;
        if (dp[i][prev+1] != -1) {
            return dp[i][prev+1];
        }
        int skip = solve(i + 1, prev, dp, nums);
        int take = 0;
        if (prev == -1 || nums[i] > nums[prev])
         {
            take = 1 + solve(i + 1, i, dp, nums);
        }

        return dp[i][prev+1] = Math.max(take, skip);
    }

}
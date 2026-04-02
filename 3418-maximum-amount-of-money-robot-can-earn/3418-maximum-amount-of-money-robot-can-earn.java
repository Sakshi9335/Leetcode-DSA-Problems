class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        int k = 2;
        int[][][] dp = new int[m][n][k + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }

        return solve(0, 0, k, coins, dp);
    }

    public int solve(int i, int j, int k, int[][] coins, int[][][] dp) {
        int m = coins.length;
        int n = coins[0].length;
        if (i >= m || j >= n) return Integer.MIN_VALUE;

        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && k > 0) return 0; 
            return coins[i][j];
        }

        if (dp[i][j][k] != Integer.MIN_VALUE) return dp[i][j][k];

        int right = solve(i, j + 1, k, coins, dp);
        int down = solve(i + 1, j, k, coins, dp);

        int take = Integer.MIN_VALUE;
        if (right != Integer.MIN_VALUE || down != Integer.MIN_VALUE) {
            take = coins[i][j] + Math.max(right, down);
        }

        int skip = Integer.MIN_VALUE;
        if (k > 0 && coins[i][j] < 0) {
            int rightSkip = solve(i, j + 1, k - 1, coins, dp);
            int downSkip = solve(i + 1, j, k - 1, coins, dp);

            skip = Math.max(rightSkip, downSkip);
        }

        return dp[i][j][k] = Math.max(take, skip);
    }
}
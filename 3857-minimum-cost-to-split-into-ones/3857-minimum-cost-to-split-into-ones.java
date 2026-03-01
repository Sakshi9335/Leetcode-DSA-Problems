

class Solution {
    public int minCost(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public int solve(int n, int[] dp) {
        if (n == 1)
            return dp[n] = 0;
        if (n == 2)
            return dp[n] = 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        int a=0;
        int b=0;
        if(n%2==0)
        {
            a=n/2;
            b=a;
        }
        else
        {
            a=n/2;
            b=(n/2)+1;
        }

        return dp[n]=solve(a,dp)+solve(b,dp)+(a*b);
    }
}
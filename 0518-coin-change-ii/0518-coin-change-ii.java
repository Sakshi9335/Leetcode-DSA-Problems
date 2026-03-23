class Solution {
    public int change(int amount, int[] coins) {
         int n=coins.length;
        int[][]dp=new int [n+1][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(amount,0,coins,dp);
    }
    public int solve(int amount,int i,int[]coins,int[][]dp){
          int n=coins.length;
        if(amount==0)
           return 1;
        if(i==n)
           return 0;
        if(dp[i][amount]!=-1)
           return dp[i][amount];
        
        if(coins[i]>amount)
           return dp[i][amount]= solve(amount,i+1,coins,dp);
        
        int pick = solve(amount-coins[i],i,coins,dp);
        int notpick = solve(amount,i+1,coins,dp);
        return  dp[i][amount] = pick + notpick;
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        int[][]grid = new int[m][n];
        int[][]dp = new int[m+1][n+1];
        for(int i =0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,0,dp,grid,m,n);
    }
    public int solve(int i, int j, int[][]dp, int[][]grid,  int m, int n){
       if(i==m-1 && j==n-1)
       {
        return 1;
       }
       if(i<0 || j<0 || i>=m || j>=n){
        return 0;
       }
       if(dp[i][j]!=-1){
        return dp[i][j];
       }
       int  left = solve(i+1,j,dp,grid,m,n);
       int up = solve(i,j+1,dp,grid,m,n);
       return dp[i][j] = left+up;
    }
}
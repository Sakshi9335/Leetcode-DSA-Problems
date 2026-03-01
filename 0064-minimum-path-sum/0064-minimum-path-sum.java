class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][]dp = new int[m][n];
        for(int i =0; i<dp.length; i++)
        {
            for(int j = 0; j<dp[0].length; j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(grid,dp,m-1,n-1);
    }
    public int solve(int [][]grid , int [][]dp, int i, int j)
    {
        if(i < 0 || j < 0) 
        return Integer.MAX_VALUE;
    
    if(i == 0 && j == 0) 
     return grid[i][j];
    
    
    if(dp[i][j] != -1) 
    return dp[i][j];

    int up = solve(grid,dp,i-1, j);
    int left = solve(grid,dp,i, j-1);
    
    return dp[i][j] = grid[i][j] + Math.min(up, left);
    }
}
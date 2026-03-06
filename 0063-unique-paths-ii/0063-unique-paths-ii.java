class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
   int  m = obstacleGrid.length;
   int n = obstacleGrid[0].length;
   
     int[][]dp = new int[m][n];
     for(int i=0; i<dp.length; i++)
     {
       Arrays.fill(dp[i],-1);
     }
     return solve(obstacleGrid,dp,0,0,m,n);
    }
    public int solve(int[][]Grid , int [][]dp, int i, int j, int m,int n){
          if(i >= m || j >= n)
            return 0;

        if(Grid[i][j] == 1)
            return 0;

        if(i == m-1 && j == n-1)
            return 1;

        if(dp[i][j] != -1)
            return dp[i][j];

        int right = solve(Grid, dp, i+1, j, m, n);
        int down = solve(Grid, dp, i, j+1, m, n);

        return dp[i][j] = right + down;
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
      return totalsum(nums);
    }

    public boolean totalsum(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];
        }
        if(sum % 2 != 0)
        {
            return false;
        }
        else 
           return subsetsum(arr,sum/2,n);
        
    }

  public   boolean subsetsum(int[]arr,int sum, int n){
     boolean[][] dp = new boolean[n + 1][sum + 1];

     for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= sum; j++) {    // Initialization
        if (i == 0 && j == 0)
            dp[i][j] = true;  
        else if (i == 0)
            dp[i][j] = false;  
        else if (j == 0)
            dp[i][j] = true;
    }
}
      for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];

            }
        }

        return dp[n][sum];
    }
}

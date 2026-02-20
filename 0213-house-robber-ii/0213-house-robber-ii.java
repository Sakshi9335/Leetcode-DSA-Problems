class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n==1){
            return nums[0];
        }
       int[]dp1 = new int [n+1];
       int[]dp2 = new int[n+1];
       Arrays.fill(dp1,-1);
       Arrays.fill(dp2,-1);
       int n1 =solve(nums,dp1,n-2,0);
       int n2= solve(nums,dp2,n-1,1);
        return Math.max(n1,n2);
    }
    public int solve(int[]arr, int[]dp,int i, int j){
         if (i < j) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int pick = arr[i]+solve(arr,dp,i-2,j);
        int npick = solve(arr,dp,i-1,j);
        return dp[i]=Math.max(pick,npick);

    }
}
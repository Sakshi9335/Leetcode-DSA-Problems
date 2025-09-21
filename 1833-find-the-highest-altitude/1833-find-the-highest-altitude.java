class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int highest = 0;
        int []ans = new int[n+1];
        ans[0] = 0;
        for (int i = 1; i<=n;i++){
            ans [i] = ans[i-1]+gain[i-1];
             if (highest < ans[i])
            {
            highest = ans[i];
            }
        }
       return highest;
    }
}
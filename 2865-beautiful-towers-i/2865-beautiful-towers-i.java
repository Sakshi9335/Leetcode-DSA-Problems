class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long ans = 0;
        for (int i=0;i <n;i++) 
        {
            long sum =heights[i];
            int curr = heights[i];
            for (int j = i - 1; j >= 0; j--) 
            {
                curr = Math.min(curr, heights[j]); 
                sum += curr;
            }
            curr = heights[i];
            for (int j= i+ 1;j< n;j++) 
            {
                curr = Math.min(curr,heights[j]);
                sum += curr;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
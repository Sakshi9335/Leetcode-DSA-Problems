class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0L;
        int i =0, n= happiness.length;
        while(k>0){
             if(happiness[n-1-i]-i >= 0)
             {
              ans += (long)(happiness[n-1-i]-i);
             }
           i++;
           k--;
        }
        return ans;
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int maxsum = Integer.MIN_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sum += nums[j];
            if(j-i+1==k){
                maxsum = Math.max(maxsum,sum);
                sum -= nums[i];
                i++;
            }
            

        }
        return  (double) maxsum /k;
    }
}
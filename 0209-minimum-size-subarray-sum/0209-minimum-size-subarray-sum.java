class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minimum = Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sum += nums[j];
            while(sum>=target){
                minimum=Math.min(minimum,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        if(minimum == Integer.MAX_VALUE){
            return 0;
        }
        return minimum;
    }
}
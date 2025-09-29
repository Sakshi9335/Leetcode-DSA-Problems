class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int n = nums.length;
        int l = 0, sum = 0, minLen = Integer.MAX_VALUE;
        
        for (int r = 0; r < n; r++) {
            sum += nums[r];
            
            while (sum >= target) {  
                minLen = Math.min(minLen, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if (minLen != Integer.MAX_VALUE){
            return minLen;
        }
        else{
            return 0;
        }
        
    }
}
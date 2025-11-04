class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
       long mx = -1L;
       long diff = 0L;
        for (int i = 1; i<nums.length;i++){
           if (nums[i]>nums[i-1] ){
          diff = Math.abs((long)nums[i] - (long)nums[i-1]);
              mx = Math.max(mx,diff);
           }
        
        }
       
        
        if (nums.length<2) 
        return 0;
       if (mx == -1L)
        return 0;
        return  (int)mx;
    }
}
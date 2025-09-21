class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum =0;
        int totalSum = 0;
        for (int i =0;i<nums.length;i++)
        {
           totalSum += nums[i];    
        }
         for (int i =0;i<nums.length;i++)
         {
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum){
                return i;
            }
            else {
                  leftSum += nums[i];
                       
            }
         }
         return -1;
    }
}
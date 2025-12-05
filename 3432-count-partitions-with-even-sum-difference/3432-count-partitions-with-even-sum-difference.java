class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i =1; i<n;i++){
         nums[i] = nums[i]+nums[i-1];
        }
        
       int total=nums[n-1];
       for(int i=0;i<n-1;i++)
       {
         int left=nums[i];
         int right=total-left;
         int diff=right-left;
         if(diff%2==0)
         count++;
       }
       return count;
    }
}
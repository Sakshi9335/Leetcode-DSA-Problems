class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){    // main logic 
                return new int[]{i,j};
            }
        }
       }
       return new  int[]{};
    }
}
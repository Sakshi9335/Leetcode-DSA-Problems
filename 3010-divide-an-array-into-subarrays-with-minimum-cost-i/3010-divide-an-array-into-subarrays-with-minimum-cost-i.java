class Solution {
    public int minimumCost(int[] nums) {
        int cost = nums[0];
         int min1 = Integer.MAX_VALUE;
          int min2 = Integer.MAX_VALUE;
          for(int i =1; i<nums.length; i++){
            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2 > nums[i]){
                min2= nums[i];
            }
          }
          return cost+min1+min2;
    }
}
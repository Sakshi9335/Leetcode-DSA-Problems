class Solution {
    public int maximumPossibleSize(int[] nums) {
         int currMax = 0;
        int count = 0;
        for(int num:nums){
            if(num >= currMax){
                count++;
                currMax = num;
            }
        } 
        return count;
    }
}
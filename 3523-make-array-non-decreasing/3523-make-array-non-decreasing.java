class Solution {
    public int maximumPossibleSize(int[] nums) {
         int currMax = 0;
        int count = 0;
        for(int i:nums){
            if(i >= currMax){
                count++;
                currMax = i;
            }
        } 
        return count;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int mx = 0;
        for (int i =0; i<nums.length;i++){
           if(nums[i]==1){
            count++;
           mx = Math.max(count,mx);
           }
           else 
           count =0;
        }
        return mx;
    }
}
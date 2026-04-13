class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int ans=0;
        int mindis=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans=Math.abs(i-start);
              mindis =  Math.min(ans,mindis);
                
            }
        }
       return mindis;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==i){
                continue;
            }
            else
            return i;
        }
        return n;
    
    }
}
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high =nums.length-1;
    int min = nums[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<min){
                min=nums[low];
            }
            else
            low++;
        }
        return min;
    }
}
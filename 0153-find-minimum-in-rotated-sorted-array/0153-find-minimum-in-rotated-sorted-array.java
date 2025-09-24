class Solution {
    public int findMin(int[] nums) {
        int ans = -1;
        int low =0,high= nums.length-1;
        int count = 0;
    while(low<high)
        {
            int mid = low+(high-low)/2;
            if (nums[mid]>nums[high])
            {
                low = mid +1;
                
            }
            
            else{
                high = mid ;
            }
        }
        return nums[low];
    }
}
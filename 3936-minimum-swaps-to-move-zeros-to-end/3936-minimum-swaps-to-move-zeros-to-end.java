class Solution {
    public int minimumSwaps(int[] nums) 
    {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) 
        {
            if (nums[i]!= 0)
                count++;
        }
        int swap=0;
        for (int i =0; i<count; i++) 
        {
            if(nums[i] ==0)
                swap++;
        

        }
        return swap;
        

    }
}
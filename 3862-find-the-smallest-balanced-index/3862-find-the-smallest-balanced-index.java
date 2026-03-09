class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int i=0,j=nums.length-1;
        long Sum=0,Prod=1;
        while(j!=i)
        {
            if(Sum<Prod)
            {
                Sum+=nums[i];
                i++;
            }
            else
            {
                Prod*=nums[j];
                j--;
            }
        }
        return Sum==Prod?i:-1;
    }
}
class Solution {
    public int minimumSwaps(int[] nums) {
       int l,r;
        int ans=0;
        l=0;
        r=nums.length-1;
        while(l<=r){
           if ( nums[r]==0)
              {r--;
                 continue;}
            if(nums[l]==0){
                nums[l]=nums[r];
                nums[r]=0;
                r--;
                ans++;
            }
            l++;
        }
        return ans;
    }
}
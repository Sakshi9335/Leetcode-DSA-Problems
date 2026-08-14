class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start=0,end=n-1;
      return  bs(0,n-1,nums,target);
       
    }
    public int bs(int start, int end, int[]nums,int target){
        if(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
             return mid;
          else  if(nums[mid]<=target) 
              return bs(mid+1,end,nums,target);
            else 
               return bs(start,mid-1,nums,target);
        }
        return -1;
    }
}
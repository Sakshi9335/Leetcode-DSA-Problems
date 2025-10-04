class Solution {

    public int findFirst (int [] nums, int target ){
        int l =0,h = nums.length-1;
        int ans = -1;
    while(l<=h){
        int m = l+(h-l)/2;
        if (nums[m]== target){
            ans = m;
            h= m-1;
            
        }
        else if (nums[m]<target){
            l= m+1;
        }
        else{
           h = m-1;
        }

    }
    return ans;
    }
     public int  findLast (int [] nums, int target ){
        int l =0,h = nums.length-1;
        int ans = -1;
    while(l<=h){
        int m = l+(h-l)/2;
        if (nums[m]== target){
            ans = m;
            l = m +1;
            
        }
        else if (nums[m]<target){
            l= m+1;
        }
        else{
           h = m-1;
        }

    }
    return ans;
    }
     public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};

    }

}
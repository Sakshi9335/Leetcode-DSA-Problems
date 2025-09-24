class Solution {
    public int findDuplicate(int[] nums) {
        int low =0,high = nums.length-1;
        
        while(low<high){
            int m = low+(high-low)/2;
            int count = 0;
              for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= m) {
                    count++;
                }
            }
            
            if (count > m) {
                high = m;
            } else {
                low = m + 1;
            }
        }
        
        return low;
        
    }
}
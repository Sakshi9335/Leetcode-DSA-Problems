class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int total =0;
        for(int i=0; i<n;i++){
            total += nums[i];
        }
        int   rem = total%k;
          return rem;
    }
}
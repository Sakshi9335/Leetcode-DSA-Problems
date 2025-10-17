class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
        }
        
        return nums;
    }
}
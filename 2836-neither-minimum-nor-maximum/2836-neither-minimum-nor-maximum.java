class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3)
            return -1;

        int min = nums[0];
        int max = nums[0];

       
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

       
        for (int n : nums) {
            if (n != min && n != max)
                return n;
        }

        return -1; 
    }
}

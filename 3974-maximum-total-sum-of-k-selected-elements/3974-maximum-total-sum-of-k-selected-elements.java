import java.util.*;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum = 0;

        // sort in descending order
        Arrays.sort(nums);
        int n = nums.length;

        int i = n - 1; // start from largest element

        while (k > 0 && i >= 0) {
            if (mul > 0) {
                sum += 1L * mul * nums[i];
                mul--;
            } else {
                sum += nums[i];
            }

            i--;
            k--;
        }

        return sum;
    }
}
class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int count = 0;

        for (int i = 0; i < n; i++) { 
            int idx = upperBound(nums, nums[i]);

            int greater = n - idx;

            if (greater >= k)
                count++;
        }

        return count;
    }

    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}

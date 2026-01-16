class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int low = 0;
        int high = nums[n - 1] - nums[0];

        while (low < high) 
        {
            int mid = low + (high - low) / 2;
            int c = count(nums, mid);

            if (c >= k) 
                high = mid;
            else 
                low = mid + 1;
            
        }

        return low;   
    }

    private int count(int[] nums, int mid) {
        int c = 0;
        int i = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) 
        {
            while (nums[j] - nums[i] > mid)
            {
                i++;
            }
            c += (j - i);
        }
        return c;
    }
}
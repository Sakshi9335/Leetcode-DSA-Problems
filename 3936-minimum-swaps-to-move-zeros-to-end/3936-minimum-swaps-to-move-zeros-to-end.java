class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count++;
        }
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (count == 0) {
                break;
            } 
            else 
            {
                if (nums[i] != 0) 
                {
                    ans++;
                }
                count--;
            }

        }
        return ans;

    }
}
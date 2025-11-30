class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if (k == 0) 
        return n;

        int count = 0;
        int i = 0;

        while (i < n) {
            int value = nums[i];
            int start = i;
            while (i < n && nums[i] == value) i++;

            int freq = i - start;
            int greater = n - i; 

            if (greater >= k)
                count += freq;
        }

        return count;
    }
}

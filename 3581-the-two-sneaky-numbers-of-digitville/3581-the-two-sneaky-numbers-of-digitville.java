class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];  
        int[] ans = new int[2];
        int count = 0;

        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {   
                ans[count++] = num;
                if (count == 2) break;
            }
        }

        return ans;
    }
}
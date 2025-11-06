class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
         int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums1) min1 = Math.min(min1, n);
        for (int n : nums2) min2 = Math.min(min2, n);
        return min2 - min1;
    }
}
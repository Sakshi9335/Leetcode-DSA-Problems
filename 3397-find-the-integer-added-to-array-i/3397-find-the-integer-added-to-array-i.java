class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int ans = 0;
        for (int  i =0; i<n; i++){
            ans = nums2[i]-nums1[i];
            
            
        }
        
        return ans;
    }
}
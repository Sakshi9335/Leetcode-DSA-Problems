class Solution {
    public int minOperations(int[] nums) {
         Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
              
                return (i + 1 + 2) / 3; // ceil((i+1)/3)
            }
            seen.add(nums[i]);
        }
        
        return 0;
    }
}
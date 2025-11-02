class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        
           Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) { 
                ans.add(i);
            }
        }
        return ans;
    }
}
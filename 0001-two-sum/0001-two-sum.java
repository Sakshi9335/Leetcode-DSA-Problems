class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complt = target - nums[i];
            if (numMap.containsKey(complt)) {
                return new int[]{numMap.get(complt), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
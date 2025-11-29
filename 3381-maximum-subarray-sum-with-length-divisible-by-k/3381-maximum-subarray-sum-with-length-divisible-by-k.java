class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long pref = 0;
        long ans = Long.MIN_VALUE;
        
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, 0L); 

        for (int i = 0; i < nums.length; i++) {
            pref += nums[i];
            int mod = (i + 1) % k;

            if (map.containsKey(mod)) {
                ans = Math.max(ans, pref - map.get(mod));
                map.put(mod, Math.min(map.get(mod), pref));
            } else {
                map.put(mod, pref);
            }
        }
        return ans;
    }
}

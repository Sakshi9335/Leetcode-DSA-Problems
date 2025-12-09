class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1000000007L;
        Map<Integer, Long> l = new HashMap<>();
        Map<Integer, Long> r = new HashMap<>();
        for (int n : nums) {
            r.put(n, r.getOrDefault(n, 0L) + 1);
        }
        long ans = 0;
        for (int j = 0; j < nums.length; j++) {
            int n = nums[j];
            r.put(n, r.get(n) - 1);
            long left = l.getOrDefault(2 * n, 0L);
            long right = r.getOrDefault(2 * n, 0L);
            ans = (ans + (left * right) % MOD) % MOD;
            l.put(n, l.getOrDefault(n, 0L) + 1);
        }

        return (int) ans;
    }
}
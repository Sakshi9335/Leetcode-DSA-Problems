class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
            for (int n : nums){
                mp.put(n,mp.getOrDefault(n,0)+1);
            }
             for (int n : nums) {
            if (mp.get(n) == 1) {
                return n;
            }
             }
        return -1;
    }
}
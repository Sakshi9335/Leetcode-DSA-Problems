class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int curr_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            curr_sum += i;
            count += map.getOrDefault(curr_sum-k,0);
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}
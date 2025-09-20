class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int curr_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            curr_sum += i;
            int mod = curr_sum % k;
            if (mod < 0)
            {
                mod = mod % k +k;
            }
            if (map.containsKey(mod))
            {
                count += map.get(mod);
            }
            
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return count;
    }
}
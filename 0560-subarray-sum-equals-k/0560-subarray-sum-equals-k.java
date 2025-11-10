class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int count = 0,ps =0;
        for (int n:nums){
            ps += n;
            int comp = ps-k;
            if(map.containsKey(comp)){
                count += map.get(comp);
              
            }
         map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return count;

    }
}
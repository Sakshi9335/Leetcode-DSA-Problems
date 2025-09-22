class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        long good =0;
         long total = (long) n * (n-1) / 2;
       
        for (int i =0;i<n;i++)
        {
          int  k= nums[i]-i;
            if(map.containsKey(k))
            {
                good += map.get(k);
            }
            map.put(k,map.getOrDefault(k,0)+1);
        }
         long bad = total - good;
       return bad;
    }
}
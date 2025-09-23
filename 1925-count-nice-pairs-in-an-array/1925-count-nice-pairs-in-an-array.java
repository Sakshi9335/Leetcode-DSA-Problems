class Solution {
    public int countNicePairs(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int mod = 1000000007;
        for (int i =0;i<n;i++)
        {
          int  k= nums[i]- rev(nums[i]);
            if(map.containsKey(k))
            {
                 count = (count + map.get(k)) % mod;
            }
            map.put(k,map.getOrDefault(k,0)+1);
        }
        return (int)count;
    }
     public int rev(int x) {
        int res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;


    }
}
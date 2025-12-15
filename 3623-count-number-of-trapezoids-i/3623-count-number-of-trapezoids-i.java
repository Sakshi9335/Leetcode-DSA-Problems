class Solution {
    public int countTrapezoids(int[][] points) {
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<points.length;i++)
        {
            map.put(points[i][1],map.getOrDefault(points[i][1],0)+1);
        }
        long ans=0;
        long sum=0;
        int mod=1000000007;
        long[] arr=new long[map.size()];
        int k=0;
        for(int key:map.keySet())
        {
            long n=map.get(key);
            arr[k++]=n*(n-1)/2;
        }

        for(int i=0;i<arr.length;i++)
        {
            ans=(ans+sum*(long)arr[i])%mod;
            sum=(sum+(long)arr[i])%mod;
        }

        return (int)ans;
    }
}
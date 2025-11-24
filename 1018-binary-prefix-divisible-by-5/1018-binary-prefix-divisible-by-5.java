class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long x=0;
        List<Boolean>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            x=((2*x)+nums[i])%5;
                arr.add(x==0);
        }

        return arr;
    }
}
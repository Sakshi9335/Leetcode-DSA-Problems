
       class Solution {
    public int thirdMax(int[] nums) {
        return solve(nums);
    }
    private int solve(int[] nums)
    {
        long mx1 = Long.MIN_VALUE;
        long mx2 = Long.MIN_VALUE;
        long mx3= Long.MIN_VALUE;
        for(int num: nums){
            if(num>mx1){
                mx3=mx2;
                mx2=mx1;
                mx1=num;
            }
            else if(num>mx2 && num!=mx1){
                mx3=mx2;
                mx2=num;
            }
            else if(num>mx3 && num!=mx1 && num!=mx2){
                mx3=num;
            }
        }
        if(mx3 != Long.MIN_VALUE){
            return (int)mx3;
        }
        return (int)mx1;
    }
}
        
   
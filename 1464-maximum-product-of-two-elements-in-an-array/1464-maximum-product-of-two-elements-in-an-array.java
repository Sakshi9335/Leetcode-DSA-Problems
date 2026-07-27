class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxpro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                maxpro=Math.max((nums[i]-1)*(nums[j]-1),maxpro);
 
            }
        }
        return maxpro;
    }
}
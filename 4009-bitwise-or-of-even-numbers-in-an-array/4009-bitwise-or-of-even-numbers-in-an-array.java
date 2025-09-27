class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans =0;
        for (int i=0;i<nums.length;i++ ){
            if (nums[i]%2 == 0){
                ans = ans|nums[i];
            }
        }
        return ans;
    }
}
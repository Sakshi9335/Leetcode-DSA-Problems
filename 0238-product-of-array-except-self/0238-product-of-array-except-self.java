class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int [n];
        int start =1;
        for(int i =0; i<n;i++){
            ans[i] =  start;
            start *= nums[i];
        }
         int end  =1;
        for(int i =n-1; i>=0;i--){
            ans[i] *=  end;
            end *= nums[i];
        }
        return ans;
    }
}
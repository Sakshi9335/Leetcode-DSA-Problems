class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int n = nums.length;
      int e =0;
      int od = 1;
      while(e<n && od < n){
        if(nums[e] % 2 == 0){
             e += 2;
        }
        else if(nums[od] % 2 == 1){
             od += 2;
        }
        else {
            int temp = nums[e];
            nums[e]=nums[od];
            nums[od]= temp;
            e += 2;
            od +=2;
        }
      }
      return nums;
    }
}
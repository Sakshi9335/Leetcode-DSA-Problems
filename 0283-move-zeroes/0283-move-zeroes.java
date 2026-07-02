class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) {
             swap(i,index,nums);
              index++;
            }
        }
        
        
    }
    public void swap(int i,int index,int[]nums){
        if (i != index)
        {  
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
       }
    }
}
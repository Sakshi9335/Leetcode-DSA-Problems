class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if (nums[i] == nums[i + 1])
            {
               nums[i]= nums[i]*2;
               nums[i+1]=0;
            } 
        }
        moveZeroes(nums);
        return nums;
    }
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
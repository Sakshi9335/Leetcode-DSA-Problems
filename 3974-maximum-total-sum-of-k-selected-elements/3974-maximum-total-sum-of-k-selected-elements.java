import java.util.*;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        int[]kmax=new int[k];
        for(int i=0;i<k;i++){
            kmax[i]=nums[n-1-i];
        }
        long sum=0;
        for(int i=0;i<k;i++){
            if(mul<=0){
                sum=sum+kmax[i];
            }   
            else{
             sum += 1L*mul*kmax[i];
            mul--;
            }
        }

        return sum;
    }
}
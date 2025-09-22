class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
       int [] res = new int [n];
       int start = 0,end = n-1 , index = n-1;
       while(start<=end){
         int sq1 = nums[start]*nums[start];
         int sq2 = nums[end]*nums[end];
         if (sq1 <= sq2)
         {
            res[index] = sq2;
            index--;
            end--;
         }
         else{
          res[index] = sq1;
          index--;
          start++;
         }

       }
       return res;
    }
}
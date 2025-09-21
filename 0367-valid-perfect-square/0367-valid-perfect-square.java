class Solution {
    public boolean isPerfectSquare(int num) {
        int low =1 , high = num;

         while(low<=high)
         {
            int mid = low+(high-low)/2;
            long sq = (long) mid*mid;
            if (sq == num)
            {
                return true;
            }
            else if (sq<num)
            {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
         }
         return false;
    }
}
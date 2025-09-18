class Solution {
    public int mySqrt(int x) {
       if (x<2)
       return x;
       int low=1, high = x/2; 
       int ans =0;
    //    kyunki square root x/2 se zyada kabhi nahi hoga except x=1,2).
     
    while(low<=high){
        int mid = low+(high-low)/2;
        long sq = (long) mid * mid;
        if (sq== x){
            return mid;
        }
        else if (sq <x){
            ans = mid;
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return ans;
    }
}
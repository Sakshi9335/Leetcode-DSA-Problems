class Solution {
    public int trailingZeroes(int n) {
        if(n==0 ||n==1)
        return 0;
        int ans=0;
        long div=5;
        while(div<=n)
        {
            ans = ans+n/(int)div;
            div *= 5;
        }
        return ans;
    }
}
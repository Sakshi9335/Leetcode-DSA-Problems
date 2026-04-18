class Solution {
    public int mirrorDistance(int n) {
        int rev=reverse(n);
       int ans = Math.abs(n-rev);
       return ans;
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
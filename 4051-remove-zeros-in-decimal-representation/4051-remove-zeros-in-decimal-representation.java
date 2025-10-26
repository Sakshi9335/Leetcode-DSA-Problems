class Solution {
    public long removeZeros(long n) {
        long ans = 0;
       
        while (n > 0) {
            long r = n % 10;
            if (r != 0) {
                ans=10*ans+r;
                
            }
            n = n / 10;
        }

        long rev=0; 
        while(ans>0) { 
            long d=ans%10; 
            rev=rev*10+d; 
            ans=ans/10;
         } 
             return rev;

       
    }
}
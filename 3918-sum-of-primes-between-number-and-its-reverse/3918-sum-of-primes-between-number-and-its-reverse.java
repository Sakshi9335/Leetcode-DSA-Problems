class Solution {
    public int sumOfPrimesInRange(int n) {
       int start= Math.min(n,reverse(n));
       int end= Math.max(n,reverse(n));
       int sum=0;
       for(int i = start; i <= end; i++){
        if(prime(i)==true){
            sum+=i;
        }
       }
       return sum;
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
    public boolean prime(int n){
        if(n<2) return false;
          for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
            return false;
        }
          }
          return true;
    }
}
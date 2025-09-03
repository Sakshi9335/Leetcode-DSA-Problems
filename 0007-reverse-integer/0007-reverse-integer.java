class Solution {
    public int reverse(int x) {
        int rev =0;
        int num = x,d;
        while(num!=0){
            d = num%10;
            num = num/10;
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return 0;
            }
          rev = rev * 10 + d;
        }
        return rev;
    }
}
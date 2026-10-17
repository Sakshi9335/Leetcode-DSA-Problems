class Solution {
    public boolean isPalindrome(int x) {
        int digit;
        int rev=0;
        int original = x;
        while(x>0){
            digit = x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev==original;
    }
}
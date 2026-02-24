class Solution {
    public boolean isPalindrome(int x) {
        int d,rev =0;
        int original = x;
        while (x>0)
        {
            d = x%10;
            rev = rev *10+d;
            x = x/10;
        }
        if (rev == original)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
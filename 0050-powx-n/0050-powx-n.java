class Solution {
    public double myPow(double x, int n) {
        long p = n;
        if( p< 0)
        {
           x = 1 / x;
            p = -p;
        }
    return Math.pow(x,p);
    }
}
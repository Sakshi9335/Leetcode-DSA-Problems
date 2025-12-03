class Solution {
    public int lastRemaining(int n) {
         int ans= 1;
        int step = 1;
        boolean left = true;

        while (n > 1) {
            if (left || n % 2 == 1)
                ans += step;
            step *= 2;
            n /= 2;
            left = !left;
        }
        return ans;
            }
}
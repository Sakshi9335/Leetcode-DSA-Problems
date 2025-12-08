class Solution {
    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c2 = a * a + b * b;
                int c = (int) Math.sqrt(c2);

                if (c * c == c2 && c <= n) {
                    count++;
                }

            }
        }
        return count;
    }
}
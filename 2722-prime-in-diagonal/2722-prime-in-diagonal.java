class Solution {
    public int diagonalPrime(int[][] nums) {
        int m = nums.length;
        int mx = 0;
          for (int i =0;i<m;i++){
            for (int j =0; j<m; j++){
                if (i == j || i + j == m - 1){
                   int ans = nums[i][j];
                    if (isPrime(ans)) {
                        mx = Math.max(mx, ans);
                    }
                }
            }
        }
        return mx;
            
        
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
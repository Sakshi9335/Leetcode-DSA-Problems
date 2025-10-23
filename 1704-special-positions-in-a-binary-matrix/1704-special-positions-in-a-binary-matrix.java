class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
         int[] rSum = new int[m];
        int[] cSum = new int[n];
        
        for (int i =0; i < m; i++){
            for (int j = 0; j < n; j++){
                rSum[i] += mat[i][j];
                cSum[j] += mat[i][j];
                
            }
        }

         int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rSum[i] == 1 && cSum[j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] ans = new int [n*n];
        int index = 0;
        for ( int i = 0; i<n;i++){
            for (int j =0;j < n;j++){
                ans[index++] = matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}
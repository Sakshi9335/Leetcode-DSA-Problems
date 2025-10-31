class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        int sum = 0;
        int cols = nums[0].length;
        for (int j = 0; j < cols; j++) {
            int maximum = 0;
            for (int i = 0; i < nums.length; i++) {
                maximum = Math.max(maximum, nums[i][j]);
            }
            sum += maximum;
        }
        return sum;
    }
}
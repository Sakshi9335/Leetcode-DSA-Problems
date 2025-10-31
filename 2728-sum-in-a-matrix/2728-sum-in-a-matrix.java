class Solution {
    public int matrixSum(int[][] nums) {
           for (int[] num : nums) {
            Arrays.sort(num);
        }
        int sum = 0;
        int currentValue = 0;
        
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                currentValue = Math.max(currentValue, nums[j][i]);
            }
            sum += currentValue;
        }

        return sum;
    }
}
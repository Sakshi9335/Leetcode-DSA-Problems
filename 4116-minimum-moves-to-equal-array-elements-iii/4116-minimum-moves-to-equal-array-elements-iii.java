class Solution {
    public int minMoves(int[] nums) {
        // int largest = Integer.MIN_VALUE;
        //     int n = nums.length;
        //     for (int i =0; i<n;i++){
        //     if (nums[i]>largest){
        //         largest = nums[i];
        //     }
        //     }
        // int count =0;
        // for (int i =0; i<n;i++){
        //     if (nums[i]<largest){
        //         count += (largest - nums[i]);
        //     }
        // }

       int largest = Integer.MIN_VALUE;
            int n = nums.length;
            int sum =0;
            for (int i =0; i<n;i++){
             largest =   Math.max(largest,nums[i]);
             sum = sum+nums[i];
            }

        return (largest*n - sum);
    }
}
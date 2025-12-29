class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count =0;
        int sum =0;
        int n = nums.length;
        int []prefixSum = new int [n+1];
        prefixSum[0]=1;
        for(int num : nums){
            sum+=num;
            if(sum>=goal){
                count += prefixSum[sum-goal];
            }
            prefixSum[sum]++;
        }
        return count;
    }
}
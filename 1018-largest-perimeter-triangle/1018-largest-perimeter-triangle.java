class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i;
        for( i =n-1 ; i >=2; i--){
            int b = nums[i-1];
            int c = nums[i-2];
            int a = nums[i];
           if( b + c > a){
            return a+b+c;
           }
        }
        return 0;

    }
}
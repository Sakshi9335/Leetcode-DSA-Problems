class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        int left = 0;
        int ans = 0;
        for (int i = 0; i< nums.length; i++){
            total += nums[i];
        }
        for (int i = 0; i<nums.length;i++){
            if (nums[i] == 0){
                 
                 int right = total-left-nums[i];
                 if (left == right){
            ans += 2;
        }
        else if ((Math.abs(left - right) == 1)){
            ans += 1;
        }
        }
            left += nums[i];
        }
        
        return ans;
    }
}
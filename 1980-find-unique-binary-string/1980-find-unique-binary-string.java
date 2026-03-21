class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        String ans = "";
        for (int i = 0; i < n; i++) 
        {
            char ch = nums[i].charAt(i);
            if (ch == '0') 
                ans += "1";
            else 
                ans += "0";
            
        }
        return ans;
    }
}